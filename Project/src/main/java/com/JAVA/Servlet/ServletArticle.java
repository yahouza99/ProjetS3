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
public class ServletArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    private MovieDAO movieDAO;
	    private TitreDAO titreDAO;
	    private CelebDAO celebDAO;

	    
	    public void init() throws ServletException {
	        	DAOFactory daoFactory = DAOFactory.getInstance();
	            this.movieDAO = daoFactory.getMovie();
	            this.titreDAO=daoFactory.getTitreDao();
	            this.celebDAO = daoFactory.getCelebDao();
	        }  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
        try {
            switch (action) {
                case "newarticle":
                        showNewForm(request, response);
                    break;
                case "majarticle":
                        showMajForm(request, response);
                    break;
                case "insertarticle":
    					insertarticle(request, response);
    			    break;
                case "uparticle":
    					updatearticle(request, response);
    			    break;
                case "deletearticle":
    					deletearticle(request, response);
    				break;
                case "findarticle":
					findarticle(request, response);
				break;
                case "confirm":
					confirmer(request, response);
			    break;
                case "allarticle":
                	listarticles(request, response);
                    break;
                case "allarticle2":
                	listarticles2(request, response);
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
private void listarticles (HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <MovieBean> listmovies=movieDAO.getAllMovies();
/* Enregistrement de la liste des messages dans l'objet requête */
request.setAttribute("listmovies",listmovies );
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Article.jsp");
dispatcher.forward(request, response);
}

private void listarticles2(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <TitreBean> listtitres=titreDAO.getAllTitres();
/* Enregistrement de la liste des messages dans l'objet requête */
request.setAttribute("listtitres",listtitres );
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Article2.jsp");
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

private void insertarticle(HttpServletRequest request, HttpServletResponse response)
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
private void deletearticle(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
celebDAO.delete(id);
response.sendRedirect("/Project/ServletCelebrity?action=allceleb");
}
private void findarticle(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	CelebBean celeb=new CelebBean(null,null,null,null,null,null,null);
   int id = Integer.parseInt(request.getParameter("id"));
   celeb=celebDAO.find(id);
  request.setAttribute("celeb", celeb); 
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Celeb_prof.jsp");
dispatcher.forward(request, response);
}

private void updatearticle(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
String photo = request.getParameter("photo");
celebDAO.update(photo);
response.sendRedirect("/JSP/Accueil_fan.jsp");	    
}


}
