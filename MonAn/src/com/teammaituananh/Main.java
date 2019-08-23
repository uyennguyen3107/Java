package com.teammaituananh;

import java.util.Scanner;

import com.teamtuananh.CRUD.CRUD;

public class Main {

	public static void main(String[] args) {
		CRUD a = new CRUD();
		Scanner scan = new Scanner(System.in);
		int x = 1;
		do {
			System.out.print("1. Thêm món ăn." + "\n2. Xóa món ăn." + "\n3. Sửa món ăn." + "\n4. List");
			int nhap = scan.nextInt();
			switch (nhap) {
			case 1:

				System.out.println("Mời nhập tên món ăn và giá món ăn");
				a.InsertMonAn(scan.next(), scan.nextInt());
				break;
			case 2:

				System.out.println("Mời bạn nhập id món ăn cần xóa");
				a.DeleteMonAn(scan.nextInt());
				break;
			case 3:
				System.out.println("Mời bạn nhập id món ăn cần update và giá món ăn cần update");
				int i = scan.nextInt();
				int g = scan.nextInt();
				a.UpdateMonAn(i, g);
				break;
			case 4:

				break;

			default:
				break;
			}
		} while (x > 0);

	}

}
