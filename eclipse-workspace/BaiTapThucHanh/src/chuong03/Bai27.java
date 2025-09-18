package chuong03;

import java.util.Scanner;

public class Bai27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap N:");
		int N = sc.nextInt();
		
		int f1 = 1, f2 = 1;
		System.out.println(N +" so dau tien cua day Fibonacci");
		
		if ( N >= 1) System.out.println(f1 + " ");
		if ( N >= 2) System.out.println(f2 + " ");
		
		for ( int i = 3; i <= N; i++) {
			int f = f1 + f2;
			System.out.println(f + " ");
			f1 = f2;
			f2 = f;
		}
		sc.close();
	}

}
