package com.JAVA.Servlet;

import java.io.IOException;
import java.util.List;

import com.JAVA.Beans.CelebBean;
import com.JAVA.Beans.MovieBean;
import com.JAVA.Beans.SondageBean;
import com.JAVA.Beans.Sondage_tBean;
import com.JAVA.Beans.TitreBean;
import com.JAVA.DAO.CelebDAO;
import com.JAVA.DAO.DAOFactory;
import com.JAVA.DAO.MovieDAO;
import com.JAVA.DAO.SondageDAO;
import com.JAVA.DAO.TitreDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCelebrity
 */
public class ServletSondage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    private CelebDAO celebDAO;
	    private SondageDAO sondageDAO;
	    private MovieDAO movieDAO;
	    private TitreDAO titreDAO;
	    
	    public void init() throws ServletException {
	        	DAOFactory daoFactory = DAOFactory.getInstance();
	            this.celebDAO = daoFactory.getCelebDao();
	            this.sondageDAO=daoFactory.getSondageDao();
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
                case "newsondage":
                        showNewForm(request, response);
                    break;
                case "newsondage_t":
                    showNewForm_t(request, response);
                break;
                case "insertsondage":
    					insertsondage(request, response);
    			    break;
                case "insertsondage_t":
					insertsondage_t(request, response);
			    break;
                case "deletesondage":
    					deletesondage(request, response);
    				break;
                case "deletesondage_t":
					deletesondage_t(request, response);
				break;
                case "findsondage":
					findsondage(request, response);
				break;
                case "findsondage_t":
					findsondage_t(request, response);
				break;
                case "updatesondage":
					updatesondage(request, response);
				break;
                case "updatesondage_t":
					updatesondage_t(request, response);
				break;
                case "allsondage":
                	listsondages(request, response);
                    break;
                case "allsondage_t":
                	listsondages_t(request, response);
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
private void listsondages (HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <SondageBean> listsondages =sondageDAO.getAllSondages();
/* Enregistrement de la liste des messages dans l'objet requête */
List <MovieBean> listmovies=movieDAO.getAllMovies();
request.setAttribute("listsondages",listsondages );
request.setAttribute("listmovies",listmovies );
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Sondage.jsp");
dispatcher.forward(request, response);
}
private void listsondages_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <Sondage_tBean> listsondages =sondageDAO.getAllSondages_t();
/* Enregistrement de la liste des messages dans l'objet requête */
List <TitreBean> listtitres=titreDAO.getAllTitres();
request.setAttribute("listsondages",listsondages );
request.setAttribute("listtitres",listtitres);
/* Transmission vers la page en charge de l'affichage des résultats */
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Sondage2.jsp");
dispatcher.forward(request, response);
}
private void showNewForm(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	List <MovieBean> listmovies=movieDAO.getAllMovies();
	request.setAttribute("listmovies",listmovies );
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/NewSondage.jsp");
dispatcher.forward(request, response);
}
private void showNewForm_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	List <TitreBean> listtitres=titreDAO.getAllTitres();
	request.setAttribute("listtitres",listtitres);
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/NewSondage2.jsp");
dispatcher.forward(request, response);
}

private void insertsondage(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException{
	int id1 = Integer.parseInt(request.getParameter("id1"));
	int id2 = Integer.parseInt(request.getParameter("id2"));
    SondageBean sondage = new  SondageBean(id1,id2);
    sondageDAO.create(sondage);
    response.sendRedirect("/Project/ServletSondage?action=allsondage");
} 
private void insertsondage_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException{
	  int id1 = Integer.parseInt(request.getParameter("id1"));
	  int id2 = Integer.parseInt(request.getParameter("id2"));
      Sondage_tBean sondage = new  Sondage_tBean(id1,id2);
      sondageDAO.create_t(sondage);
      response.sendRedirect("/Project/ServletSondage?action=allsondage_t");
}
private void deletesondage(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
sondageDAO.delete(id);
response.sendRedirect("/Project/ServletSondage?action=allsondage");
}
private void deletesondage_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
sondageDAO.delete_t(id);
response.sendRedirect("/Project/ServletSondage?action=allsondage_t");
}
private void findsondage(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	SondageBean sondage=new SondageBean(0,0);
   int id = Integer.parseInt(request.getParameter("id"));
   sondage=sondageDAO.find(id);
  request.setAttribute("sondage", sondage);
  List <MovieBean> listmovies=movieDAO.getAllMovies();
  request.setAttribute("listmovies",listmovies );
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/FicheSondage.jsp");
dispatcher.forward(request, response);
}
private void findsondage_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
	Sondage_tBean sondage=new Sondage_tBean(0,0);
   int id = Integer.parseInt(request.getParameter("id"));
   sondage=sondageDAO.find_t(id);
  request.setAttribute("sondage", sondage);
  List <TitreBean> listtitres=titreDAO.getAllTitres();
  request.setAttribute("listtitres",listtitres);
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/FicheSondage.jsp");
dispatcher.forward(request, response);
}
private void updatesondage(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
int statu = Integer.parseInt(request.getParameter("statu"));
sondageDAO.update(statu,id);
response.sendRedirect("/Project/ServletSondage?action=allsondage");
}
private void updatesondage_t(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
int statu = Integer.parseInt(request.getParameter("statu"));
sondageDAO.update_t(statu,id);
response.sendRedirect("/Project/ServletSondage?action=allsondage_t");
}

}
