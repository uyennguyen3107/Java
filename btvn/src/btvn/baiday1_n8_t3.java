package btvn;

import java.util.Scanner;

public class baiday1_n8_t3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
hinhchunhat(scan);
hinhchunhatrong(scan);
tamgiacvuong(scan);
tamgiacvuongrong(scan);
tamgiaccan(scan);
tamgiaccanrong(scan);


	}
	public static void hinhchunhat(Scanner scan ) {
		System.out.println("chiều dài: ");
		int dai = scan.nextInt();
		System.out.println("chiều rộng: ");
		int rong = scan.nextInt();
		for (int i = 1; i <= dai; i++) {
			for (int j = 1; j < rong; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}
	public static void hinhchunhatrong(Scanner scan ) {
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
	public static void tamgiacvuong(Scanner scan ) {
		System.out.print("chiều cao hình tam giác vuông cân là: ");
		int cao = scan.nextInt();
		for (int i = 1; i <= cao; i++) {
			for (int j = 1; j <= cao; j++) {
				if (j <= i) {
					System.out.print("* ");

				} else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public static void tamgiacvuongrong(Scanner scan ) {
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
	public static void tamgiaccan(Scanner scan ) {
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
	public static void tamgiaccanrong(Scanner scan) {
		System.out.print("chiều cao hình vuông cân là: ");
		int h = scan.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = 1; j <= 2 * h - 1; j++) {
				if (i < h - 1) {
					if (j == h - i || j == h + i) {
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


