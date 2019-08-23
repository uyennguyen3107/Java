package btvn;

import java.util.Scanner;

public class baitap5_n3_t3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("chiều cao hình vuông cân là: ");
		int h = scan.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = 1; j <= 2 * h - 1; j++) {
				if (j >= h - i && j <= h + i) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
