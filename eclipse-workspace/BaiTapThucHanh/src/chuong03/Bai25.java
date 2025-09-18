package chuong03;

import java.util.Scanner;

public class Bai25 {
	public static boolean laSoNguyenTo(int n) {
		if (n<2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if ( n%i == 0) return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap N:");
		int N = sc.nextInt();
		int tong = 0;
		for(int i = 2; i < N; i++) {
			if(laSoNguyenTo(i)) {
				tong += i;
			}
		}
		System.out.println("Tổng các số nguyên tố nhỏ hơn " + N + " la: "+tong);
		sc.close();

	}

}
