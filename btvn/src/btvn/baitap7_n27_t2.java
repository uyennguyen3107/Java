package btvn;

import java.util.Scanner;

public class baitap7_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("mời nhập a: ");
		float a=scan.nextFloat();
		if(a==0) {
			System.exit(0);
		}
		System.out.println("mời nhập b: ");
		float b=scan.nextFloat();
		System.out.println("mời nhập c: ");
		float c=scan.nextFloat();
		float x1;
		float x2;
		float denta = b*b-4*a*c;
		if(denta<0) {
			System.out.print("phương trình vô nghiệm");
		}
		if(denta==0) {
			x1=x2=-b/(2*a);
			System.out.print("x1=x2= "+x1);
		}
		if(denta>0) {
			x1=(float)(-b+Math.sqrt(denta))/(2*a);
			x2=(float)(-b-Math.sqrt(denta))/(2*a);
			System.out.println("x1= "+ x1);
			System.out.print("x2= "+ x2);
		}

	}

}
