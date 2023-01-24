package com.JAVA.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.Console;
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
    public static final String PAGE_JSP_FAN = "JSP/Fan_Ad.jsp";
    private FanDAO fanDAO;
    
    public void init() throws ServletException {
        	DAOFactory daoFactory = DAOFactory.getInstance();
            this.fanDAO = daoFactory.getFanDao();
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "newfan":
                        showNewForm(request, response);
                    break;
                case "majfan":
                        showMajForm(request, response);
                    break;
                case "insertfan":
    					insertfan(request, response);
    			    break;
                case "upfan":
    					updatefan(request, response);
    			    break;
                case "deletefan":
    					deletefan(request, response);
    				break;
                case "findfan":
					findfan(request, response);
				break;
                case "confirm":
					confirmer(request, response);
			    break;
                case "allfan":
                	listfans(request, response);
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
   private void listfans (HttpServletRequest request, HttpServletResponse response)
          throws Exception,ServletException, IOException {
           List <FanBean> listfans =fanDAO.getAllFans();
          /* Enregistrement de la liste des messages dans l'objet requête */
          request.setAttribute("listfans",listfans );
          /* Transmission vers la page en charge de l'affichage des résultats */
          RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Fan.jsp");
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
        request.setAttribute("liste",fanDAO.getAllFans());  
        RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Update_fan.jsp");
        dispatcher.forward(request, response);
        }

   private void insertfan(HttpServletRequest request, HttpServletResponse response)
          throws Exception,ServletException, IOException{
          String nom = request.getParameter("nom");
          String prenom = request.getParameter("prenom");
          String nationalite = request.getParameter("nationalite");
          String sexe = request.getParameter("sexe");
          String email = request.getParameter("email");
          String login = request.getParameter("login");
          String password = request.getParameter("password");
          FanBean fan = new FanBean(login,password,nom,prenom,nationalite,sexe,email);
          fanDAO.create(fan);
          response.sendRedirect("/Project/SevletFAN?action=confirm");
          }  
   private void deletefan(HttpServletRequest request, HttpServletResponse response)
        throws Exception,ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        fanDAO.delete(id);
        response.sendRedirect("/Project/SevletFAN?action=allfan");
       }
   private void findfan(HttpServletRequest request, HttpServletResponse response)
       throws Exception,ServletException, IOException {
        FanBean fan=new FanBean(null,null,null,null,null,null,null);
        int id = Integer.parseInt(request.getParameter("id"));
        int t = Integer.parseInt(request.getParameter("t"));
        fan=fanDAO.find(id);
        request.setAttribute("fan", fan); 
        if(t==1) {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/one_fan.jsp");
            dispatcher.forward(request, response);
        }else {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Profile.jsp");
 	       dispatcher.forward(request, response);
        } 
      }
   private void updatefan(HttpServletRequest request, HttpServletResponse response)
      throws Exception,ServletException, IOException {
       String photo = request.getParameter("photo");
       fanDAO.update(photo);
       response.sendRedirect("/JSP/Accueil_fan.jsp");	    
      }

}
