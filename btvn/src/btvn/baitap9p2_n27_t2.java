package btvn;

import java.util.Scanner;

public class baitap9p2_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời nhập bảng cửu chương: ");
		int a=scan.nextInt();
		int tich;
		for (int x=1;x<=10;x++) {
			tich=a*x;
			System.out.println(a+" x "+x+" = "+tich);
		}

	}

}
