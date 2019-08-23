package btvn;

import java.util.Scanner;

public class baitap8_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời nhập một số nguyên bất kỳ: ");
		int a= scan.nextInt();
		if(a==1) {
			System.out.print("a ko phải số nguyên tố");
			System.exit(0);
		}
		int dem=0;
		for(int x=1; x<a;x++) {
			if(a%x==0) {
				dem=dem+1;
			}
		}
		if(dem>1) {
			System.out.print("a ko phải số nguyên tố");
		}
		else System.out.print("a là số nguyên tố");

	}

}
