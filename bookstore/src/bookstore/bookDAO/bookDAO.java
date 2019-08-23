package bookstore.bookDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookstore.beans.book;

public class bookDAO {
	public static List<book> getAllBook(Connection conn){
		List<book> listbook = new ArrayList<>();
		String sql="select * from bookstore";
		try {
			PreparedStatement pr=conn.prepareStatement(sql);
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				int id= rs.getInt("id");
				String title=rs.getString("title");
				String author=rs.getString("author");
				float price = rs.getFloat("price");
				book book = new book(id, title, author, price);
				listbook.add(book);
			}
			pr.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listbook;
	}
}
