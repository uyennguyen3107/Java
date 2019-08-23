package com.hocsinh.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hocsinh.interface_CRUD.interface_CRUD;
import com.hocsinh.connect.connect;

public class CRUD implements interface_CRUD{
	public	Connection connectSQL = connect.getJDBCConnection();

	@Override
	public void ListDanhSachTheoYeuCau(String yeuCau) {
		try {
			String sql = yeuCau;
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstname = rs.getString("firstName");
				String lastname = rs.getString("lastName");
				String sdt = rs.getString("telephone");
				String gioitinh = rs.getString("gender");
				int tuoi = rs.getInt("age");
				Float diem = rs.getFloat("scores");
				System.out.println("id: " + id + "\nFirstname: " + firstname + "\nLastname: " + lastname +
						"\nGiớiTinh: " + gioitinh + "\nSDT: " + sdt + "\nTuổi: " 
						+ tuoi + "\nDiem: " + diem);
				System.out.println("SASD");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
