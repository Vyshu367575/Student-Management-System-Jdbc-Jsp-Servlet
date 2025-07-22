package com.vc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/hitme")
public class Myservlet extends HttpServlet {
	
	
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			response.sendRedirect("text/html");
			
			
			//read index.html page controls data
			String name = request.getParameter("tbName");
			String number = request.getParameter("tbNumber");
			
			PrintWriter out = response.getWriter();
			out.print("hello");
			
			RequestDispatcher Dispatcher = request.getRequestDispatcher("result.jsp");
			Dispatcher.forward(request,response);
			
		}
	}