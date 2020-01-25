package com.javalec.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitPara
 */
/* web.xml 이용 불러 올때 주석 처리 @WebServlet({ "/InitPara", "/InitP" }) */
//Servlet 파일 자체에 초기화 파라미터 직접 입력
@WebServlet(urlPatterns= {"/InitP"},initParams = {@WebInitParam(name = "id", value = "Spring"), @WebInitParam(name = "pw", value = "9999")})
public class InitPara extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitPara() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//web.xml 에 초기화 한 값 불러오기
		String id = getInitParameter("id");
		String pw = getInitParameter("pw");
		
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
