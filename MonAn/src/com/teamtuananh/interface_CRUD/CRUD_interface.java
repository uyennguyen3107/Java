package com.teamtuananh.interface_CRUD;

public interface CRUD_interface {
        public abstract void ListMonAn();
        public abstract void InsertMonAn(String TenMA, int Gia);
        public abstract void UpdateMonAn(int ID, int Gia);
        public abstract void DeleteMonAn(int ID);
}
