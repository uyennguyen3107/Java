package btvn;

import java.util.Scanner;

public class congso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời nhập số");
		int a= scan.nextInt();
		int tong=0;
		for(int x=0;x<=a;x++) {
			tong=tong+x;
			 
		}
		System.out.print(tong);
	}

}
