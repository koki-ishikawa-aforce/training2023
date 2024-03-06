package loginTest.jp.co.aforce.k.ishikawa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginTest.jp.co.aforce.k.ishikawa.dao.UsersDao;
import loginTest.jp.co.aforce.k.ishikawa.dto.UsersDto;
import loginTest.jp.co.aforce.k.ishikawa.model.RegistrationModel;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String userName = request.getParameter("user_name");
		String ageStr = request.getParameter("age");
		 
		
			
		
		RegistrationModel model = new RegistrationModel();
		UsersDto result = model.checkExistsUser(id);
		UsersDao udao = new UsersDao();
	
	

		if (result.getUserID() != null) {
			request.setAttribute("errorMsg", "このIDは既に利用されています。");				
		
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);

			} else if (ageStr == "") {
				if(userName == "") {
					userName = "NULL";
				}
				udao.insertUserAgeless(id, password, userName);				
				
				RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
				rd.forward(request, response);
			} else {
				if(userName == "") {
					userName = "NULL";
				}
				int age = Integer.valueOf(request.getParameter("age"));
			udao.insertUser(id, password, userName, age);
				
			RequestDispatcher rd = request.getRequestDispatcher("signin.jsp");
			rd.forward(request, response);
		   }
			
		

	}
}
