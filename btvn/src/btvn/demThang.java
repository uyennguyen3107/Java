package btvn;

import java.util.Scanner;

public class demThang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập tháng: ");
		int x= scan.nextInt();
		switch (x) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("có 31 ngày");
			
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
		 
			System.out.print("có 30 ngày");
			
			break;
		case 2:
		 
			System.out.print("có 29 ngày");
			
		default:
			break;
		}

	}

}
