package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServer")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		PrintWriter out = response.getWriter(); //출력도구용 출력 스트림에텍스트를 보내겠다.
		
		out.print("id : " + id);
		out.print("pw : " + pw);

	}

}
