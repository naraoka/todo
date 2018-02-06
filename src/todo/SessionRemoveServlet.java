package todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionRemoveServlet
 */
@WebServlet("/SessionRemoveServlet")
public class SessionRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate();

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>TODOアプリケーション</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"web.css\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>TODOアプリケーション</h1>");
		out.println("<strong>出力画面：値を削除しました。</strong>");

		out.println("<form action =\"index.jsp\" "
				+ "method=\"post\" >");
		out.println("<input type=\"submit\" "
				+ "value=\"戻る\">");
		out.println("</body><html>");
	}

}
