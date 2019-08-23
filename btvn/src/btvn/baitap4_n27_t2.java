package btvn;

import java.util.Scanner;

public class baitap4_n27_t2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("nhập số vô đi nào: ");
		int soNguyen= scan.nextInt();
		if(soNguyen%2==0) {
			System.out.print("số chẵn nè!!!");
		}
		else System.out.print("số lẽ nha!!!");
		
	}

}
