package com.JAVA.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.JAVA.Beans.AdminBean;
import com.JAVA.Beans.CelebBean;
import com.JAVA.Beans.FanBean;
import com.JAVA.Beans.MovieBean;
import com.JAVA.Beans.SondageBean;
import com.JAVA.Beans.Sondage_tBean;
import com.JAVA.Beans.TitreBean;
import com.JAVA.DAO.AdminDAO;
import com.JAVA.DAO.CelebDAO;
import com.JAVA.DAO.DAOFactory;
import com.JAVA.DAO.FanDAO;
import com.JAVA.DAO.MovieDAO;
import com.JAVA.DAO.SondageDAO;
import com.JAVA.DAO.TitreDAO;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String PAGE_JSP  = "/JSP/Login.jsp";
    private FanDAO fanDAO;
    private CelebDAO celebDAO;
    private AdminDAO adminDAO;
    private SondageDAO sondageDAO;
    private MovieDAO movieDAO;
    private TitreDAO titreDAO;
    
    public void init() throws ServletException {
        	DAOFactory daoFactory = DAOFactory.getInstance();
            this.fanDAO = daoFactory.getFanDao();
            this.celebDAO = daoFactory.getCelebDao();
            this.adminDAO = daoFactory.getAdminDao();
            this.sondageDAO=daoFactory.getSondageDao();
            this.movieDAO = daoFactory.getMovie();
            this.titreDAO=daoFactory.getTitreDao();
        }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action==null){
			action="default";
		}
        try {
            switch (action) {
                case "login":
                        login(request, response);
                    break;
                case "loginadmin":
                    loginadmin(request, response);
                break;
                case "logout":
                        logout(request, response);
                    break;
                case "logtest":
                    logtest(request, response);
                break;
                case "logtestadmin":
                    logtestadmin(request, response);
                break;
                default:
                	accueil(request, response);
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
	private void login(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
	           RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Login.jsp");
	           dispatcher.forward(request, response);
	          }
	private void loginadmin(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
	           RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Login.jsp");
	           dispatcher.forward(request, response);
	          }
	private void logout(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
	           RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Accueil.jsp");
	           dispatcher.forward(request, response);
	          }
	private void logtest(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
		FanBean fan=new FanBean(null,null,null,null,null,null,null);
		CelebBean celeb=new CelebBean(null,null,null,null,null,null,null);
        String login= request.getParameter("login");
        String password= request.getParameter("password");
        fan=fanDAO.logtest(login, password);
        celeb=celebDAO.logtest(login, password);
        if(fan==null) {
        	if(celeb==null) {
        		response.sendRedirect("/Project/ServletLogin?action=login");
        	}else {
        		List <MovieBean> listmovies=movieDAO.getAllCeleb_Movies(celeb.getId());
        		List <TitreBean> listtitres=titreDAO.getAllCeleb_Titres(celeb.getId());
        		int ml=listmovies.size();
        		int tl=listtitres.size();
        		request.setAttribute("celeb",celeb); 
                RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Celebrity/Home.jsp");
                dispatcher.forward(request, response);
        	}
                }else {
                	SondageBean sondage=sondageDAO.findligne();
               		List <MovieBean> listmovies=movieDAO.getAllMovies();
               		Sondage_tBean sondage1=sondageDAO.find_tligne();
               		List <TitreBean> listtitres=titreDAO.getAllTitres();
               		List <CelebBean> listcelebs =celebDAO.getAllCelebs();
                	request.setAttribute("fan",fan); 
                	request.setAttribute("sondage",sondage); 
                	request.setAttribute("listmovies",listmovies); 
                	request.setAttribute("sondage1",sondage1); 
                	request.setAttribute("listtitres",listtitres); 
                	request.setAttribute("listcelebs",listcelebs); 
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/Home.jsp");
                    dispatcher.forward(request, response);
                 }
	          }
	
	private void logtestadmin(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
		AdminBean admin=new AdminBean(null,null,null,null);
       String login= request.getParameter("login");
       String password= request.getParameter("password");
       admin=adminDAO.logtest(login, password);
       	if(admin==null) {
       		response.sendRedirect("/Project/ServletLogin?action=loginadmin");
       	}else {
       		List <SondageBean> listsondages =sondageDAO.getAllSondages();
       		int s1=listsondages.size();
       		List <MovieBean> listmovies=movieDAO.getAllMovies();
       		int m=listmovies.size();
       		List <Sondage_tBean> listsondages_t=sondageDAO.getAllSondages_t();
       		int s2=listsondages_t.size();
       		List <TitreBean> listtitres=titreDAO.getAllTitres();
       		int t=listtitres.size();
       		List <FanBean> listfans =fanDAO.getAllFans();
       		int f=listfans.size();
       		List <CelebBean> listcelebs =celebDAO.getAllCelebs();
       		int c=listcelebs.size();
       		request.setAttribute("admin",admin); 
       		request.setAttribute("s",s1+s2);
       		request.setAttribute("m",m );
       		request.setAttribute("t",t);
       		request.setAttribute("f",f);
       		request.setAttribute("c",c);
               RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Home.jsp");
               dispatcher.forward(request, response);
       	}
       	
	          }
	
	private void accueil(HttpServletRequest request, HttpServletResponse response)
	         throws Exception,ServletException, IOException {
	           RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Accueil.jsp");
	           dispatcher.forward(request, response);
	          }
	   

}

