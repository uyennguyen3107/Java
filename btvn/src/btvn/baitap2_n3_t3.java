package btvn;

import java.util.Scanner;

public class baitap2_n3_t3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("chiều dài: ");
		int dai = scan.nextInt();
		System.out.println("chiều rộng: ");
		int rong = scan.nextInt();
		for (int i = 1; i <= dai; i++) {
			System.out.print("* ");
			if (i == 1 || i == dai) {
				for (int j = 2; j < rong; j++) {
					System.out.print("* ");
				}
			} else
				for (int j = 2; j < rong; j++) {
					System.out.print("  ");
				}
			System.out.println("*");
		}

	}

}
