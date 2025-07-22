package com.vc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/result")
public class Myservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m = request.getParameter("tbMath");
		int math = Integer.parseInt(m);
		String p = request.getParameter("tbphy");
		int phy = Integer.parseInt(p);
		String c = request.getParameter("tbchem");
		int chem = Integer.parseInt(c);
		
		//percentage
		float per = (math+phy+chem)*100/300;
		String grade = null;
		if(per >= 60) {
			grade="first class";
			
			
		}
		else if(per >=35){
			grade ="second class";
			
		}
		else {
			grade ="fail";
		}
		
		request.setAttribute("percentage", per);
		request.setAttribute("grade", grade);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
	}

}
