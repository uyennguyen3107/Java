package kpop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maituananh.model.student;

import nhomKpop.nhom;

/**
 * Servlet implementation class controller
 */
@WebServlet("/kpop")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Kpop.jsp");
		requestDispatcher.forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Kpop.jsp");
		List<nhom> stringList= new ArrayList<>();
	    String tennhom = (String) request.getParameter("tennhom");
	    String soluong = (String) request.getParameter("soluong");
	    stringList.add(new nhom(tennhom, soluong));
	    request.setAttribute("list", stringList);
	    
		requestDispatcher.forward(request, response);
		 
	}

}
