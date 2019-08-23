package btvn;

import java.util.Scanner;

public class baitap4_n3_t3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("chiều cao hình tam giác vuông cân là: ");
		int cao = scan.nextInt();
		for (int i = 1; i <= cao; i++) {
			for (int j = 1; j <= cao; j++) {
				if (i < cao) {
					if (i == j || j == 1) {
						System.out.print("* ");
					} else
						System.out.print("  ");
				} else
					System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
