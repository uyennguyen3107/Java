package btvn;

import java.util.Scanner;

public class baitap1_n8_t3 {

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

		int max = 0;
		for (int j = 0; j < mang.length; j++) {
			if (mang[j] > max) {
				max = mang[j];
			}
		}
		System.out.print("giá trị lớn nhất trong mảng là: " + max);
	}
}
