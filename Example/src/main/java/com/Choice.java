package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Choice")
public class Choice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//사용자가 입력한 값 받아오기
		String nav = request.getParameter("nav");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby"); //값 리스트 형태로 여러개 가져올 때 getParameterValues
		
		System.out.println("국적 : " + nav);
		System.out.println("성별 : " + gender);
		
		//취미 중복선택
		System.out.print("취미 : ");
		for(int i = 0; i<hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		
		
	}

}
