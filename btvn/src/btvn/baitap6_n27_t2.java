package btvn;

import java.util.Scanner;

public class baitap6_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("mời nhập a: ");
		float a= scan.nextInt();
		if(a==0) {
			System.exit(0);
		}
		System.out.print("mời nhập b: ");
		float b=scan.nextInt();
		if(b==0) {
			System.out.print("phương trình có vô số nghiệm");
			System.exit(0);
		}
		float x=(-1*b)/a;
		System.out.print(x);

	}

}
