package com.shopthuuyen.tuixach;

public class tuixach {
	private int Ma;
	private String Loai;
	private String Hieu;
	private int Gia;

	public tuixach(int ma, String loai, String hieu, int gia) {
		super();
		Ma = ma;
		Loai = loai;
		Hieu = hieu;
		Gia = gia;
	}

	public tuixach(int ma, int gia) {
		super();
		Ma = ma;
		Gia = gia;
	}

	public tuixach(String loai) {
		super();
		Loai = loai;
	}

	public tuixach(int ma) {
		super();
		Ma = ma;
	}

	public tuixach(String loai, String hieu) {
		super();
		Loai = loai;
		Hieu = hieu;
	}

	public int getMa() {
		return Ma;
	}

	public void setMa(int ma) {
		Ma = ma;
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	}

	public String getHieu() {
		return Hieu;
	}

	public void setHieu(String hieu) {
		Hieu = hieu;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

}
