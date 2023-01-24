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
import com.JAVA.Beans.DemandeBean;
import com.JAVA.Beans.FanBean;
import com.JAVA.Beans.MovieBean;
import com.JAVA.Beans.SondageBean;
import com.JAVA.Beans.Sondage_tBean;
import com.JAVA.Beans.TitreBean;
import com.JAVA.DAO.CelebDAO;
import com.JAVA.DAO.DAOFactory;
import com.JAVA.DAO.DemandeDAO;
import com.JAVA.DAO.FanDAO;

/**
 * Servlet implementation class ServletDemande
 */
public class ServletDemande extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DemandeDAO demandeDAO;
	private CelebDAO celebDAO;
	private FanDAO   fanDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void  init() {
    	DAOFactory daoFactory = DAOFactory.getInstance();
        this.demandeDAO = daoFactory.getDemandeDao();
        this.celebDAO = daoFactory.getCelebDao();
        this.fanDAO = daoFactory.getFanDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
        try {
            switch (action) {
                case "newdemande":
                        showNewForm(request, response);
                    break;
                case "majdemande":
                        showMajForm(request, response);
                    break;
                case "insertdemande":
    					insertdemande(request, response);
    			    break;
                case "updemande":
    					updatedemande(request, response);
    			    break;
                case "deletedemande":
    					deletedemande(request, response);
    				break;
                case "finddemande":
					finddemande(request, response);
				break;
                case "confirm":
					confirmer(request, response);
			    break;
                case "alldemande":
                	listdemandes(request, response);
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
private void listdemandes (HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
List <DemandeBean> listdemandes =demandeDAO.getAllDemandes();
/* Enregistrement de la liste des messages dans l'objet requête */
List <CelebBean> listcelebs=celebDAO.getAllCelebs();
List <FanBean>  listfans=fanDAO.getAllFans();
request.setAttribute("listdemandes",listdemandes );
request.setAttribute("listcelebs",listcelebs );
request.setAttribute("listfans",listfans );
int m= Integer.parseInt(request.getParameter("m"));
if(m==1){
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/Demande.jsp");
	dispatcher.forward(request, response);
}else if(m==2) {	
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Celebrity/Demande.jsp");
	dispatcher.forward(request, response);
}else {	
	/* Transmission vers la page en charge de l'affichage des résultats */
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/Demande.jsp");
	dispatcher.forward(request, response);
}
}

private void showNewForm(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/NewDemande.jsp");
dispatcher.forward(request, response);
}

private void insertdemande(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException{
String type = request.getParameter("type");
String motif = request.getParameter("motif");
int idf = Integer.parseInt(request.getParameter("idf"));
int idc = Integer.parseInt(request.getParameter("idc"));
DemandeBean demande=new DemandeBean(type,motif,idf,idc);
demandeDAO.create(demande);
response.sendRedirect("/Project/ServletCelebrity?action=findceleb&id="+idc+"&t=1");
} 

private void deletedemande(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int d = Integer.parseInt(request.getParameter("d"));
int id = Integer.parseInt(request.getParameter("id"));
demandeDAO.delete(id);
if(d==1) {
	response.sendRedirect("/Project/ServletDemande?action=alldemande&m=1");
}else {
	response.sendRedirect("/Project/ServletDemande?action=alldemande&m=0");
}
}

private void finddemande(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
DemandeBean demande=new DemandeBean(0,null,null,null,null,0,0,null,0);
FanBean fan=new FanBean(null,null,null,null,null,null,null);
CelebBean celeb=new CelebBean(null,null,null,null,null,null,null);
int id = Integer.parseInt(request.getParameter("id"));
int idf = Integer.parseInt(request.getParameter("idf"));
int idc = Integer.parseInt(request.getParameter("idc"));
int u = Integer.parseInt(request.getParameter("u"));
demande=demandeDAO.find(id);
fan=fanDAO.find(idf);
celeb=celebDAO.find(idc);
request.setAttribute("demande", demande);
request.setAttribute("fan", fan);
request.setAttribute("celeb", celeb);
if(u==1) {
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Fan/FicheDemande.jsp");
	dispatcher.forward(request, response);
}else if(u==2) {
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Celebrity/FicheDemande.jsp");
	dispatcher.forward(request, response);
}else {
	RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Admin/FicheDemandejsp.jsp");
	dispatcher.forward(request, response);
}
}
private void showMajForm(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
request.setAttribute("liste",celebDAO.getAllCelebs());  
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/Update_fan.jsp");
dispatcher.forward(request, response);
}

private void updatedemande(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
int id = Integer.parseInt(request.getParameter("id"));
int statu = Integer.parseInt(request.getParameter("statu"));
String contenu= request.getParameter("contenu");
String mot = request.getParameter("mot");
demandeDAO.update(statu, contenu, mot, id);
response.sendRedirect("/Project/ServletDemande?action=alldemande&m=2");
}
private void confirmer(HttpServletRequest request, HttpServletResponse response)
throws Exception,ServletException, IOException {
RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/confirm_ins.jsp");
dispatcher.forward(request, response);
}

}
