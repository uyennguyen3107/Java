package btvn;
import java.util.Scanner;
public class package_buoi2 {

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
		 int a=0;
		 if(dtb<5) {
			 a=1;
			 System.out.print("bạn dốt");
		 }
		 else if (dtb==5 && dtb<7) {
			 a=2;
			 System.out.print("bạn khá");
		 }
		 else {
			 a=3;
			 System.out.print("bạn giỏi");
		 }
		  
		switch (a) {
		case 1:
			System.out.print(" bạn ko được thưởng đâu nha!");
			break;
		case 2:
			System.out.print(" bạn được thưởng 1 cái ôm...ômmmmm!");
			break;
		case 3:
			System.out.print(" bạn được thưởng 1 nụ hôn....moahhhhh! ");
			break;

		default:
			break;
		}

	}

}
