package com.shopthuuyen.interface_CRUD;

public interface ChucNang_interface {
	public abstract void insert(int MaTui, String LoaiTui, String HieuTui, int GiaTui);

	public abstract void update(int MaTui, int GiaTui);

	public abstract void remove(int MaTui);

	public abstract void search(String LoaiTui);

	public abstract void list();
}
