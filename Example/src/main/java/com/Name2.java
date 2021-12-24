package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Name2")
public class Name2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글로 변환
		request.setCharacterEncoding("EUC-KR");
		
		//이름 받아오기
		String name = request.getParameter("name");
		
		response.setCharacterEncoding("EUC-KR");
		
		PrintWriter out = response.getWriter();
		
		out.print(name + "님 안녕하세요.");
		
	}

}
