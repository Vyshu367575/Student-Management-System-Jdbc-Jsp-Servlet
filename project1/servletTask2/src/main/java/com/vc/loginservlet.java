package com.vc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class loginservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html") ;
		 PrintWriter out = response.getWriter();
		 out.println("<h2>welcome to dopost() method</h2>");
		 
		 //reading html request data
		 String name = request.getParameter("tbName");
		 String number = request.getParameter("tbNumber");
		 out.println(name);
		 out.print(number);
		 
	}

}
