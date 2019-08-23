package btvn;

import java.util.Scanner;

public class baitap3_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("mời bạn nhập lần lượt 4 số nguyên: ");
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		int d= scan.nextInt();
		if(a>b && a>c&& a>d) {
			System.out.print("sô nguyên lớn nhất: "+ a);
		}
		else if(b>a && b>c && b>d) {
			System.out.print("sô nguyên lớn nhất: "+ b);
		}
		else if(c>a && c>b && c>d) {
			System.out.print("sô nguyên lớn nhất: "+ c);
		}
		else if(d>a && d>c && d>b) {
			System.out.print("sô nguyên lớn nhất: "+ d);
		}
		}
	

}
