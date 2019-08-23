package com.teammaituananh.model;

public class model {

	private int idMonAn;
	private String TenMonAn;
	private int GiaMonAn;
	public model(String tenMonAn, int giaMonAn) {
		TenMonAn = tenMonAn;
		GiaMonAn = giaMonAn;
	}
	public model(int idMonAn) {
		this.idMonAn = idMonAn;
	}
	public int getIdMonAn() {
		return idMonAn;
	}
	public void setIdMonAn(int idMonAn) {
		this.idMonAn = idMonAn;
	}
	public String getTenMonAn() {
		return TenMonAn;
	}
	public void setTenMonAn(String tenMonAn) {
		TenMonAn = tenMonAn;
	}
	public int getGiaMonAn() {
		return GiaMonAn;
	}
	public void setGiaMonAn(int giaMonAn) {
		GiaMonAn = giaMonAn;
	}
	public model(int idMonAn, int giaMonAn) {
		super();
		this.idMonAn = idMonAn;
		GiaMonAn = giaMonAn;
	}
	 

}
