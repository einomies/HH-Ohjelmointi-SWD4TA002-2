package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoAsiakas;
import model.Asiakas;

@WebServlet("/LisaaAsiakas")
public class LisaaAsiakas extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LisaaAsiakas() {
        super();
        System.out.println("LisaaAsiakas.LisaaAsiakas()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaAsiakas.doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaAsiakas.doPost()");

		int asiakasId = 0;
		String etunimi = request.getParameter("etunimi");
		String sukunimi = request.getParameter("sukunimi");
		String puhelin = request.getParameter("puhelin");
		String sposti = request.getParameter("sposti");
		Asiakas asiakas = new Asiakas(asiakasId, etunimi, sukunimi, puhelin, sposti);
		DaoAsiakas daoAsiakas = new DaoAsiakas();
		if(daoAsiakas.lisaaAsiakas(asiakas)) {
			response.sendRedirect("lisaa_asiakas_a1505210.jsp?ilmo=1");
		}else{
			response.sendRedirect("lisaa_asiakas_a1505210.jsp?ilmo=0");
		}
	}

}
