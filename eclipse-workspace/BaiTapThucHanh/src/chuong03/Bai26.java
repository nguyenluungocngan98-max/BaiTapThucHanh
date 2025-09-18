package chuong03;

import java.util.Scanner;

public class Bai26 {
	public static boolean laSoNguyenTo(int n) {
		if (n<2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if ( n%i == 0) return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap N:");
		int N = sc.nextInt();
		
		int tong = 0;
		int dem = 0;
		int i = 2;
		
		System.out.println(N+ " so nguyen to dau tien la: ");
		while(dem < N) {
			if (laSoNguyenTo(i)) {
				tong += i;
				dem ++;
				System.out.println(i + " ");
			}
			i++;
		}
		System.out.println("Tong " + N + " so nguyen to dau tien = " + tong);
		sc.close();

	}

}
