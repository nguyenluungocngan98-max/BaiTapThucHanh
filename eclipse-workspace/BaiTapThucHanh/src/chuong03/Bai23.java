package chuong03;

import java.util.Scanner;

public class Bai23 {
	public static int ucln (int a, int b) {
		while (b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen x:");
		int x = sc.nextInt();
		System.out.println("Nhap so nguyen y:");
		int y = sc.nextInt();
		System.out.printf("\nUSCLN cua "+ x + " va " + y + " la " + ucln(x,y));
		sc.close();
	}

}
