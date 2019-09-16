package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomServlet
 */
@WebServlet("/ex62servlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Random random = new Random();
		int number = random.nextInt(9);
		if (number % 2 == 1) {
			response.sendRedirect("/example2/WEB-INF/jsp/redirected.jsp");

		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/forwarded.jsp");
			dispatcher.forward(request, response);
		}


	}


}
