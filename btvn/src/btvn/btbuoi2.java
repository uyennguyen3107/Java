package btvn;

import java.util.Scanner;

public class btbuoi2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập số: ");
		int a= scan.nextInt();
		switch (a) {
		case 1:
			System.out.print("một");
			break;
		case 2:
			System.out.print("hai");
			break;
		case 3:
			System.out.print("ba");
			break;
		case 4:
			System.out.print("bốn");
			break;
		case 5:
			System.out.print("năm");
			break;

		default:
			break;
		}
	}

}
