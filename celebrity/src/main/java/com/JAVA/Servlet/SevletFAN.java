package com.JAVA.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.JAVA.Beans.FanBean;
import com.JAVA.DAO.DAOFactory;
import com.JAVA.DAO.FanDAO;

/**
 * Servlet implementation class SevletFAN
 */
public class SevletFAN extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String PAGE_JSP  = "/JSP/Fan.jsp";
    private FanDAO fanDAO;
    
    public void init() throws ServletException {
        	DAOFactory daoFactory = DAOFactory.getInstance();
            this.fanDAO = daoFactory.getFanDao();
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <FanBean> listfans =fanDAO.getAllFans();
        /* Enregistrement de la liste des messages dans l'objet requête */
        request.setAttribute("listfans",listfans );
        /* Transmission vers la page en charge de l'affichage des résultats */
        this.getServletContext().getRequestDispatcher( PAGE_JSP ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
