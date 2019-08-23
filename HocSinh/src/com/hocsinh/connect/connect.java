package com.hocsinh.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
	public static Connection getJDBCConnection() {
		final String url = "jdbc:mysql://localhost:3306/lophocsinh";
		final String user = "root";
		final String password = "uyenngoc";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		;
		return null;

	}
	 public static void main(String[] args) {
		 Connection conect = connect.getJDBCConnection();
		 if (conect != null) {
		 System.out.println("thành công");
		 } else {
		 System.out.println("thất bại");
		 }
		 }


}
