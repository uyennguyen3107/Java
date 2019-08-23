package com.teamtuananh.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.teammaituananh.model.model;
import com.teamtuananh.connect.connect;
import com.teamtuananh.interface_CRUD.CRUD_interface;

public class CRUD implements CRUD_interface{
public Connection connectSQL =connect.getJDBCConnection();
	@Override
	public void ListMonAn() {
		try {
			String sql="SELECT * FROM monanviahe.monan;";
			PreparedStatement preparedStatement= connectSQL.prepareStatement(sql);
			 ResultSet rs =preparedStatement.executeQuery(sql);
			 while(rs.next()) {
				 int id= rs.getInt("idMonAn");
				 String ten = rs.getString("TenMonAn");
				 int gia =rs.getInt("GiaMonAn");
				 System.out.println("id"); //chưa xong
			 }
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void InsertMonAn(String TenMA, int Gia) {
		try {
			String sql="INSERT INTO monan(TenMonAn,GiaMonAn) VALUES(?,?)";
			PreparedStatement preparedStatement= connectSQL.prepareStatement(sql);
			model MA = new model(TenMA, Gia);
			preparedStatement.setString(1, MA.getTenMonAn());
			preparedStatement.setInt(2, MA.getGiaMonAn());
			int ktr =preparedStatement.executeUpdate();// thực thi câu lệnh
			if(ktr==1) {
				System.out.println("Insert thành công");
			}
			else {
				System.out.println("insert không thành công");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void UpdateMonAn(int ID, int Gia) {
		try {
			String sql="UPDATE monan SET GiaMonAn=? where idMonAn =?";
			PreparedStatement preparedStatement= connectSQL.prepareStatement(sql);
			model MA = new model(ID, Gia);
			preparedStatement.setInt(1, MA.getGiaMonAn());
			preparedStatement.setInt(2, MA.getIdMonAn());
			int ktr =preparedStatement.executeUpdate();// thực thi câu lệnh
			if(ktr==1) {
				System.out.println("Delete thành công");
			}
			else {
				System.out.println("Delete không thành công");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void DeleteMonAn(int ID) {
		try {
			String sql="DELETE FROM monanviahe.monan WHERE idMonAn = ?;";
			PreparedStatement preparedStatement= connectSQL.prepareStatement(sql);
			model MA = new model(ID);
			preparedStatement.setInt(1, MA.getIdMonAn());
			int ktr =preparedStatement.executeUpdate();// thực thi câu lệnh
			if(ktr==1) {
				System.out.println("Delete thành công");
			}
			else {
				System.out.println("Delete không thành công");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
