package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Room")
public class Room extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//정수형 받아오기
		int room = Integer.parseInt(request.getParameter("room"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<table border = 1px>");
		out.print("<tr>");
		
		for(int i = 1; i<=room; i++) {
			out.print("<td>");
			out.print(i);
			out.print("</td>");
		}
		
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
		
	}

}
