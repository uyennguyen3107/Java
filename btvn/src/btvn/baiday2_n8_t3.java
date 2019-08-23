package btvn;

import java.util.Scanner;

public class baiday2_n8_t3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời nhập chiều dài mảng: ");
		int dai= scan.nextInt();
				int [] mang = new int [dai];
		for(int i=0;i<mang.length;i++) {
			int giatri=scan.nextInt();
			System.out.println("mang"+ i+"="+ giatri );
		}

	} 
}
