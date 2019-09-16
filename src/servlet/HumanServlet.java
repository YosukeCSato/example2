package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Human;

/**
 * Servlet implementation class Human
 */
@WebServlet("/Human")
public class HumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HumanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// セッションスコープに保存するインスタンスの生成
		Human human = new Human();
		human.setName("湊　雄輔");
		human.setAge(23);

		// HttpSessionインスタンスの取得
		HttpSession session = request.getSession();

		// セッションスコープにインスタンスを保存
		session.setAttribute("human", human);

		// セッションスコープからインスタンスを取得
		Human h = (Human)session.getAttribute("human");

		// セッションスコープからインスタンスを削除
		session.removeAttribute("human");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
