package chuong03;

public class Bai28 {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Hinh a: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Hinh b: ");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Hinh c: ");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
