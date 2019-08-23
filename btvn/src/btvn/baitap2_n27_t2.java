package btvn;

import java.util.Scanner;

public class baitap2_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập chiều dài hình chữ nhật: ");
		int dai=scan.nextInt();
		if(dai<0) System.exit(0);
		else System.out.print("mời bạn nhập chiều rộng hình chữ nhật: ");
		int rong=scan.nextInt();
		if(rong<0) System.exit(0);
		else {
			int dienTich = dai*rong;
			System.out.println("diện tích hình chữ nhật là: "+ dienTich);
		}
		 
		System.out.print("mời bạn nhập cạnh của hình vuông: ");
		int canh=scan.nextInt();
		if(canh<0) System.exit(0);
		else {
			int dtHinhVuong=canh*canh;
			System.out.print("diện tích hình vuông là: "+ dtHinhVuong);
			}
	}
//nếu muốn nhập cạnh là số float kiểu số ko nguyên thì sao
}
