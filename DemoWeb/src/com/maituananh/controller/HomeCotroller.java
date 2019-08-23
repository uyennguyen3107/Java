package com.maituananh.controller;

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

/**
 * Servlet implementation class HomeCotroller
 */
@WebServlet("/login")
public class HomeCotroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HomeCotroller() {
		// TODO Auto-generated constructor stub
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

if(request.getParameter("name").equals("uyen")&&request.getParameter("pass").equals("777"))
{
	List<student> stringList= new ArrayList<>();
	student a=new student();
	a.setName("thu uyen");
	a.setTuoi(20);
	stringList.add(a);
	request.setAttribute("list", stringList);
	RequestDispatcher requestDispatcher= request.getRequestDispatcher("home.jsp");
	requestDispatcher.forward(request, response);
	}else {
	RequestDispatcher requestDispatcher= request.getRequestDispatcher("login.jsp");
	requestDispatcher.forward(request, response);}
}}
