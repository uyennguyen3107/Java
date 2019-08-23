package btvn;

public class baiday2_n3_t3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i);
			for (int j = (i+10); j <= 100; j+=10) {
				System.out.print("  " + j);
			}
			System.out.println();
		}

}}