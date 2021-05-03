package convert;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hugolopes
 */
@WebServlet("/CF")
public class CelsiusFahrenheit extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet COnvert to Celsius or Fahrenheit - ITA Java Advanced</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet CelsiusFahrenheit at " + request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("op");
		float temp = Float.parseFloat(request.getParameter("temp"));
		float result = 0;

		switch (option) {
		case "cf":
			// Convert de Celcius to Fahrenheit
			result = ((temp * 9) / 5) + 32;
			break;

		case "fc":
			// Convert de Fahrenheit to Celcius
			result = ((temp - 32) * 5) / 9;
			break;
		}

		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			out.println("<h3>Result of convert:</h3> <span>" + result + "</span>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}

}
