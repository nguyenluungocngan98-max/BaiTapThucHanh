package chuong03;

import java.util.Scanner;

public class Bai20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi S:");
		String chuoi = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < chuoi.length(); i++){
			char c = chuoi.charAt(i);
			if(Character.isDigit(c)) count ++;
		}
		System.out.println("So ki tu so trong chuoi S la: " + count);
		sc.close();

	}

}
