package btvn;

import java.util.Scanner;

public class baitap1_n27_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập tháng: ");
		int month = scan.nextInt();
		int nextmonth = month + 1;
		if (month == 12) {
			System.out.print("tháng tiếp theo là tháng: 1 và có 31 ngày");
		} else {
			switch (nextmonth) {
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("tháng tiếp theo là tháng " + nextmonth + " có 31 ngày");

				break;

			case 4:
			case 6:
			case 9:
			case 11:

				System.out.print("tháng tiếp theo là tháng " + nextmonth + " có 30 ngày");

				break;
			case 2:

				System.out.print("tháng tiếp theo là tháng " + nextmonth + " có 29 ngày");

			}
		}
	}
}
