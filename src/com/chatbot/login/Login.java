package com.chatbot.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chatbot.download.MakeRequest;
import com.chatbot.logindb.LoginDatabase;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginDatabase db = new LoginDatabase();
		if(uname.equals("admin") && pass.equals("adminbot")) {
			MakeRequest obj = new MakeRequest();
			try {
				obj.downloadFile();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("download.jsp");
		}
		else if(db.isUserExists(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pass", pass);
			System.out.println("IN DB");
			
			response.sendRedirect("welcome.jsp");

			
		}	else {
			
			response.sendRedirect("login.jsp");
		}
	}

	

}
