Validation Of User Login

As a part of developing an e-commerce web application, you have to prototype a login scenario for the user. There is no database involved here, so you have to use fixed values for login email id and password.
Solution:
Dashboard Code:
package com.karunakar.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

//		Check whether the session already exists
		if (session.getAttribute("userName") != null) {

			out.println("<h3>Welcome " + session.getAttribute("userName"));

			out.println("<br> You are now logged in...</h3>");

			out.println("<p><h4><a href='logout'>LOGOUT</a></h4>");
		}

		else {
			response.sendRedirect("index.html");
		}

	}

}

Login Code:
package com.karunakar.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Set the content type
		response.setContentType("text/html");
		
//		Get the writer
		PrintWriter out = response.getWriter();
		
//		Get the userName from the request
		String uName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		
//		Get a reference to the HttpSession object
		HttpSession theSession = request.getSession();
		
//		Validate the username
		if(uName.trim().equals("karunakar") && userPassword.trim().equals("9988Kanna")) {
//			Save the username in the session
			theSession.setAttribute("userName", uName);
			theSession.setAttribute("userPassword", userPassword);
			
//			Redirect to the Dashboard
			response.sendRedirect("dashboard");
			
		}
		else {
			out.println("<font color='red'>Invalid username or password...</font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
		
		
	}

}

Logout Code:
package com.karunakar.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
//		Invalidate the session here
		request.getSession().invalidate();
		
		out.println("<h2>You are now logged out...<br>");
		
		out.println("<a href='index.html'>Login again</a>");
	}

}


HTML INDEX CODE:

<!DOCTYPE html>
<html>
<head>
<title>User Login</title>
</head>
<body>
<form action = "login">
<input type = "text" name =  "userName" placeholder = "USERNAME"><br>
<input type="password" name="userPassword" placeholder="Password"><br>
<input type = "submit" value = "LOGIN">
</form>
</body>
</html>


