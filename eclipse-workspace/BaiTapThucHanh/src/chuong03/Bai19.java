package chuong03;

import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi:");
		String chuoi = sc.nextLine();
		
		System.out.println("Nhap ki tu X can dem:");
		char kiTu = sc.next().charAt(0);
		
		int count = 0;
		for (int i=0; i < chuoi.length() ; i++) {
			if(chuoi.charAt(i) == kiTu) {
			count++;
			}
		}
		System.out.println("So lan xuat hien cua ki tu " + kiTu + " la:" +count);
		sc.close();

	}

}
