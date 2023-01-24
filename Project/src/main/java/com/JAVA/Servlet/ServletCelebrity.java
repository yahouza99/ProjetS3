package com.JAVA.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.JAVA.Beans.CelebBean;
import com.JAVA.Beans.MovieBean;
import com.JAVA.Beans.TitreBean;
import com.JAVA.DAO.CelebDAO;
import com.JAVA.DAO.DAOFactory;
import com.JAVA.DAO.MovieDAO;
import com.JAVA.DAO.TitreDAO;


/**
 * Servlet implementation class ServletCelebrity
 */
public class ServletCelebrity extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public static final String PAGE_JSP_FAN = "JSP/Fan_Ad.jsp";
	    private CelebDAO celebDAO;
	    private MovieDAO movieDAO;
	    private TitreDAO titreDAO;
	    
	    public void init() throws ServletException {
	        	DAOFactory daoFactory = DAOFactory.getInstance();
	            this.celebDAO = daoFactory.getCelebDao();
	            this.movieDAO = daoFactory.getMovie();
	            this.titreDAO=daoFactory.getTitreDao();
	        }  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
        try {
            switch (action) {
                case "newceleb":
                        showNewForm(request, response);
                    break;
                case "majceleb":
                        showMajForm(request, response);
                    break;
                case "insertceleb":
    					insertceleb(request, response);
    			    break;
                case "upceleb":
    					updateceleb(request, response);
    			    break;
                case "deleteceleb":
    					deleteceleb(request, response);
    				break;
                case "findceleb":
					findceleb(request, response);
				break;
                case "confirm":
					confirmer(request, response);
			    break;
                case "celebinfan":
                	celebinfan(request, response);
			    break;
                case "allceleb":
                	listcelebs(request, response);
                    break;
            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
///////////////////////////////////////////////// /* Les autres Methodes */
private void listcelebs (HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <CelebBean> listcelebs =celebDAO.getAllCelebs();
/* Enregistrement de la liste des messages dans l'objet requête */
request.setAttribute("listcelebs",listcelebs );
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Celebrity.jsp");
dispatcher.forward(request, response);
}
private void celebinfan (HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <CelebBean> listcelebs =celebDAO.getAllCelebs();
/* Enregistrement de la liste des messages dans l'objet requête */
request.setAttribute("listcelebs",listcelebs );
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/Celebrities.jsp");
dispatcher.forward(request, response);
}
private void showNewForm(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/INCRIPTION.jsp");
dispatcher.forward(request, response);
}
private void confirmer(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/confirm_ins.jsp");
dispatcher.forward(request, response);
}
private void showMajForm(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
request.setAttribute("liste",celebDAO.getAllCelebs());  
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Update_fan.jsp");
dispatcher.forward(request, response);
}

private void insertceleb(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException{
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
String nationalite = request.getParameter("nationalite");
String sexe = request.getParameter("sexe");
String email = request.getParameter("email");
String login = request.getParameter("login");
String password = request.getParameter("password");
CelebBean celeb = new CelebBean(login,password,nom,prenom,nationalite,sexe,email);
celebDAO.create(celeb);
response.sendRedirect("/Project/ServletCelebrity?action=confirm");
}  
private void deleteceleb(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
celebDAO.delete(id);
response.sendRedirect("/Project/ServletCelebrity?action=allceleb");
}
private void findceleb(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	CelebBean celeb=new CelebBean(null,null,null,null,null,null,null);
   int id = Integer.parseInt(request.getParameter("id"));
   int t = Integer.parseInt(request.getParameter("t"));
   celeb=celebDAO.find(id);
       
   request.setAttribute("celeb", celeb);
  if(t==1) { 
	      List <MovieBean> listmovies=movieDAO.getAllCeleb_Movies(id);
	      List <TitreBean> listtitres=titreDAO.getAllCeleb_Titres(id);
	       int ml=listmovies.size();
		   int tl=listtitres.size();
		   List <CelebBean> listcelebs =celebDAO.getAllCelebs();
	      request.setAttribute("listcelebs",listcelebs);
	      if(ml>0) request.setAttribute("movie",listmovies.get(0));
	      if(tl>0) request.setAttribute("titre",listtitres.get(0));
		  request.setAttribute("ml", ml);
		  request.setAttribute("tl",tl);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/Celeb_profile.jsp");
	  dispatcher.forward(request, response);  
        }else if(t==2){
        	 List <MovieBean> listmovies=movieDAO.getAllCeleb_Movies(id);
   	      List <TitreBean> listtitres=titreDAO.getAllCeleb_Titres(id);
   	       int ml=listmovies.size();
   		   int tl=listtitres.size();
   	      if(ml>0) request.setAttribute("movie",listmovies.get(0));
   	      if(tl>0) request.setAttribute("titre",listtitres.get(0));
   		  request.setAttribute("ml", ml);
   		  request.setAttribute("tl",tl);
          RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/NewDemande.jsp");
      	  dispatcher.forward(request, response);
        }else {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Profile.jsp");
        	dispatcher.forward(request, response);
        }
}

private void updateceleb(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
String photo = request.getParameter("photo");
celebDAO.update(photo);
response.sendRedirect("/JSP/Accueil_fan.jsp");	    
}


}
