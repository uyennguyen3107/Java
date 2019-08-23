package bookstore.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookstore.beans.book;
import bookstore.bookDAO.bookDAO;
import bookstore.connectDB.connectDB;


@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = connectDB.getConnectionDB();
	public controller() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		switch(action){
		case "/list":
			showListBook(request,response);
			break;
		default :
			showListBook(request,response);
			break;
		}
	}

	
	private void showListBook(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<book> listBook;
			listBook = bookDAO.getAllBook(conn);
			request.setAttribute("listbook", listBook);
			RequestDispatcher rd = request.getRequestDispatcher("list_book.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
