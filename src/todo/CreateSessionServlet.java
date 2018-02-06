package todo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Phase1Servlet
 */
@WebServlet("/CreateSessionServlet")
public class CreateSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//値を受け取る
		String kazu1 = request.getParameter("kazu");
		String naiyou1 = request.getParameter("naiyou");


		HttpSession session = request.getSession();
		InfoBean infBean = (InfoBean)session.getAttribute("infBean");
		if (infBean == null) {
			infBean = new InfoBean();
		}

		//Beanに値をセット
		RecordBean recordBean = new RecordBean();
		recordBean.setContent(naiyou1);
		recordBean.setDegree(kazu1);

		infBean.addRecordBean(recordBean);

		session.setAttribute("infBean", infBean);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);

	}


}