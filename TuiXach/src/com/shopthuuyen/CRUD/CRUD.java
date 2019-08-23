package com.shopthuuyen.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shopthuuyen.interface_CRUD.ChucNang_interface;
import com.shopthuuyen.tuixach.tuixach;
import com.shopthuuyen.connect.connect;

public class CRUD implements ChucNang_interface {
	public Connection connectSQL = connect.getJDBCConnection();

	@Override
	public void insert(int MaTui, String LoaiTui, String HieuTui, int GiaTui) {
		try {
			String sql = "INSERT INTO tuixach (ma, loai, hieu, gia) " + "VALUES(?,?,?,?)";
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			tuixach TX = new tuixach(MaTui, LoaiTui, HieuTui, GiaTui);
			preparedStatement.setInt(1, TX.getMa());
			preparedStatement.setString(2, TX.getLoai());
			preparedStatement.setString(3, TX.getHieu());
			preparedStatement.setInt(4, TX.getGia());
			int ktr = preparedStatement.executeUpdate();// thực thi câu lệnh
			if (ktr == 1) {
				System.out.println("Bạn đã thêm túi xách này thành công");
			} else {
				System.out.println("Chưa thành công xin thử lại");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(int MaTui, int GiaTui) {
		try {
			String sql = "UPDATE tuixach SET gia=? WHERE ma=?";
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			tuixach TX = new tuixach(MaTui, GiaTui);
			preparedStatement.setInt(1, TX.getGia());
			preparedStatement.setInt(2, TX.getMa());
			int ktr = preparedStatement.executeUpdate();// thực thi câu lệnh
			if (ktr == 1) {
				System.out.println("Bạn đã cập nhật túi xách này thành công");
			} else {
				System.out.println("Chưa thành công xin thử lại");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void remove(int MaTui) {
		try {
			String sql = "DELETE FROM tuixach WHERE ma=?";
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			tuixach TX = new tuixach(MaTui);
			preparedStatement.setInt(1, TX.getMa());
			int ktr = preparedStatement.executeUpdate();// thực thi câu lệnh
			if (ktr == 1) {
				System.out.println("Bạn đã xóa túi xách này thành công");
			} else {
				System.out.println("Chưa thành công xin thử lại");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void search(String LoaiTui) {

		try {
			String sql = "SELECT * FROM tuixach WHERE loai = '?';";
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			tuixach TX = new tuixach(LoaiTui);
			System.out.println(TX.getLoai());
			preparedStatement.setString(1,TX.getLoai());
			ResultSet rs = preparedStatement.executeQuery(sql);
			while (rs.next()) {
				int ma = rs.getInt("ma");
				String loai = rs.getString("loai");
				String hieu = rs.getString("hieu");
				int gia = rs.getInt("gia");
				System.out.println("Mã: " + ma + "\nLoại: " + loai + "\nHiệu: " + hieu + "\nGiá: " + gia);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	public void list() {
		try {
			String sql = "SELECT * FROM shopthuuyen.tuixach;";
			PreparedStatement preparedStatement = connectSQL.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery(sql);
			while (rs.next()) {
				int ma = rs.getInt("ma");
				String loai = rs.getString("loai");
				String hieu = rs.getString("hieu");
				int gia = rs.getInt("gia");
				System.out.println("Mã: " + ma + "\nLoại: " + loai + "\nHiệu: " + hieu + "\nGiá: " + gia);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	

}
