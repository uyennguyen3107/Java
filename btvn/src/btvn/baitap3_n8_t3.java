package btvn;

import java.util.Scanner;

public class baitap3_n8_t3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời nhập chiều dài mảng: ");
		int length = scan.nextInt();
		int[] mang = new int[length];
		nhap(scan, mang);
		xuat(mang);
		kiemtra(scan, mang);
	}

	public static void nhap(Scanner scan, int[] mang) {

		for (int i = 0; i < mang.length; i++) {
			int giatri = scan.nextInt();
			mang[i] = giatri;
			System.out.println("mang " + "[" + i + "]" + "=" + giatri);
		}
	}

	public static void xuat(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			System.out.println("mang " + "[" + i + "]" + "=" + mang[i]);
		}
	}
	public static void kiemtra(Scanner scan, int[] mang) {
		System.out.print("mời nhập x: ");
		int x = scan.nextInt();
		for (int i = 0; i < mang.length; i++) {
			if (x == mang[i]) {
				System.out.println("số " + x + " ở vị trí thứ " + (i + 1) + " trong " + mang.length + " số, ở vị trí thứ "
						+ i + " trong mảng đó");
			}
		}

	}
}
