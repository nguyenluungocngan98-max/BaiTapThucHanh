package chuong03;

import java.util.Scanner;

public class Bai24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu:");
		int n = sc.nextInt();
		
		int tong = 0;
		for(int i = 1; i <= n ; i++) {
			System.out.println("Nhap phan tu thu " + i + " :");
			int x = sc.nextInt();
			tong += x;
		}
		System.out.println("Tổng N số nguyên: " + tong);
		sc.close();

	}

}
