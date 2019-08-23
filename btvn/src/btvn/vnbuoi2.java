package btvn;

import java.util.Scanner;

public class vnbuoi2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("nhập điểm toán:");
	 float toan= scan.nextInt();
	 System.out.println("nhập điểm lý:");
	 float ly= scan.nextInt();
	 System.out.println("nhập điểm hóa:");
	 float hoa= scan.nextInt();
	 float tong = toan+ ly+ hoa;
	 float dtb = tong /3;
	 System.out.println("điểm trung bình là: "+dtb);
}
}
