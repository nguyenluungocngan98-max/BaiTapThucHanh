package chuong03;

public class Bai16 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Vui long nhap tham so n tu command line!");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[0]);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap a:");
//		int a = scanner.nextInt();
//		System.out.println("Nhap b:");
//		int b = scanner.nextInt();

		System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0\n", a,b);
		
		if(a==0 && b==0) System.out.println("Pt vo nghiem");
		else {
			float x =(float) -b/a;
			System.out.printf("\nPt co nghiem = " + x);
		}
//		scanner.close();

	}

}
