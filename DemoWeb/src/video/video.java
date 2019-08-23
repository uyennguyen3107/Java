package video;

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
import SanPhamWeb.SanPham;
/**
 * Servlet implementation class video
 */
@WebServlet("/video")
public class video extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<SanPham> listSanPham= new ArrayList<>();
     
    public video() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("video.jsp");
		 
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("video.jsp");
		String tenSP = "ao dài tay";
		String gia = "500000vnd";
		String img = "hinh-anh-dep-nhat-the-gioi-ve-su-hoan-hao-khien-moi-nguoi-ngo-ngang2.jpg";
		listSanPham.add(new SanPham(tenSP,gia,img));
		String tenSP1 = "quan";
		String gia1 = "700000vnd";
		String img1 = "abc.jpg";
		listSanPham.add(new SanPham(tenSP1,gia1,img1));
		request.setAttribute("list", listSanPham);
		requestDispatcher.forward(request, response);
//		response.getWriter().print("ten: "+ request.getParameter("name")+"pass: "+request.getParameter("pass"));
//		 
	}

}
