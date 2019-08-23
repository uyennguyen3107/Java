package btvn;

import java.util.Scanner;

public class baitap5_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập giờ phút giây: ");
		int gio=scan.nextInt();
		int phut=scan.nextInt();
		int giay=scan.nextInt();
		if (gio>24 || phut>60 || giay>60) {
			System.exit(0);
		}
		else System.out.print(gio + " giờ "+ phut + " phút " + giay +" giây");

	}

}
