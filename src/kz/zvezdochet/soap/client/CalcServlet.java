package kz.zvezdochet.soap.client;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CalcServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int iyear = Integer.parseInt(req.getParameter("iyear"));
		int imonth = Integer.parseInt(req.getParameter("imonth"));
		int iday = Integer.parseInt(req.getParameter("iday"));
		int ihour = Integer.parseInt(req.getParameter("ihour"));
		int imin = Integer.parseInt(req.getParameter("imin"));
		int isec = Integer.parseInt(req.getParameter("isec"));
		double dzone = Double.parseDouble(req.getParameter("dzone"));
		double dlat = Double.parseDouble(req.getParameter("dlat"));
		double dlon = Double.parseDouble(req.getParameter("dlon"));
		String hstype = req.getParameter("hstype");
		resp.setContentType("text/xml");
		Calculator calc = new CalculatorService().getCalculatorPort();
		Configuration message = calc.calculate(iyear, imonth, iday, ihour, imin, isec, dzone, dlat, dlon, hstype);
		resp.getWriter().println(message);
	}
}
