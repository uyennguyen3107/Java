package com.hocsinh.main;

import java.util.Scanner;

import com.hocsinh.CRUD.CRUD;

public class MAIN {

	public static void main(String[] args) {
		String cauLenhSQL;
		CRUD a = new CRUD();
		Scanner scan = new Scanner(System.in);
		int x = 1;
		do {
			System.out.print("1. DS hocsinh." + "\n2. Ty le nam nu." + "\n3. DS hoc sinh chua cap nhap tuoi."
						+ "\n4. DS hoc sinh chua cap nhap SDT" + "\n5. DS hoc sinh da duoc sap xep");
			int nhap = scan.nextInt();
			switch (nhap) {
			case 1:
				cauLenhSQL = "SELECT * FROM lophocsinh.hocsinh;";
				System.out.println("DS hoc sinh: ");
				a.ListDanhSachTheoYeuCau(cauLenhSQL);
				break;
			case 2:

				System.out.println("Ty le nam nu");
				
				break;
			case 3:
				cauLenhSQL = "dien vo day";// cho ni dien cau lenh sql truy van ds cac hoc sinh chua co tuoi
				System.out.println("DS hoc sinh chua cap nhap tuoi: ");
				a.ListDanhSachTheoYeuCau(cauLenhSQL);
				break;
			case 4:
				cauLenhSQL = "dien vo day";
				System.out.println("DS hoc sinh chua cap nhap SDT : ");
				a.ListDanhSachTheoYeuCau(cauLenhSQL);
				break;
			case 5:
				cauLenhSQL = "dien vo day";
				System.out.println("DS hoc sinh chua duoc sap xep: ");
				a.ListDanhSachTheoYeuCau(cauLenhSQL);
				break;
			default:
				break;
			}
		} while (x > 0);

	}

}