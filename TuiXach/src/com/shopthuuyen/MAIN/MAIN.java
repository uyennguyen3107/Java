package com.shopthuuyen.MAIN;

import java.util.Scanner;

import com.shopthuuyen.CRUD.CRUD;

public class MAIN {

	public static void main(String[] args) {
		CRUD a= new CRUD();
		Scanner scan = new Scanner(System.in);
		int x=1;
		 do {
			System.out.println("1. Thêm túi xách"
					+ "\n2. Chỉnh sửa giá túi xách"
					+ "\n3. Xóa túi xách"
					+ "\n4. Tìm kiếm túi xách"
					+ "\n5. Danh sách túi xách"
					+ "\n6. Thoát");
			int nhap= scan.nextInt(); 
			switch (nhap) {
			case 1:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Mời bạn nhập MÃ");
				int m = scan1.nextInt();
				System.out.println("Mời bạn nhập LOẠI");
				String l = scan1.next();
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Mời bạn nhập HIỆU");
				String h = scan2.next();
				System.out.println("Mời bạn nhập GIÁ");
				int g = scan2.nextInt();
				a.insert(m, l, h, g);
				break;
			case 2:
				System.out.println("Mời bàn nhập mã túi xách cần sửa giá");
				int ma = scan.nextInt();
				System.out.println("Mời bạn cập nhật gía mới");
				int gia = scan.nextInt();
				a.update(ma, gia);
				break;
			case 3:
				System.out.println("Mời bạn nhập mã túi xách cần xóa");
				int xoa = scan.nextInt();
				a.remove(xoa);
				break;
			case 4:
//				System.out.println("Mời bạn nhập loại túi xách cần tìm");
//				String lo= scan.next();
//				System.out.println("Mời bạn nhập hiệu túi xách cần tìm");
//				String hi= scan.next();
				a.search(scan.next());
				break;
			case 5:
				a.list();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (x>0);

	}

}
