package chuong03;

import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri: ");
		int n = scanner.nextInt();

		if (n == 0) {
			System.out.printf("%d la zero", n);
		} else if (n % 2 != 0) {
			System.out.printf("%d la so le", n);
		} else {
			System.out.printf("%d la chan", n);
		}
		scanner.close();

	}

}
