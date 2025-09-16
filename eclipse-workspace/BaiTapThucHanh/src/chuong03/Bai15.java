package chuong03;

public class Bai15 {

	public static void main(String[] args) {
			if(args.length == 0) {
				System.out.println("Vui long nhap tham so n tu command line!");
				return;
			}
			
			int min = Integer.parseInt(args[0]);
			int max = Integer.parseInt(args[0]);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap so luong phan tu: ");
//		int n = scanner.nextInt();
//		if(n<=0) {
//			System.out.println("Day rong!");
////		}
//		System.out.println("Nhap gia tri thu 1:");
//		int value = scanner.nextInt();
//		int min = value;
//		int max = value;
//			
//			for(int i=2; i <= n; i++) {
//				System.out.println("Nhap gia tri thu"+i+":");
//				value = scanner.nextInt();
				
			for(int i=1; i<args.length; i++) {
				int value = Integer.parseInt(args[i]);
				
				if(value < min) min = value;
				if(value > max) max = value;
			}
			
			System.out.println("Gia tri nho nhat la: "+min);
			System.out.println("Gia tri lon nhat la: "+max);

	}

}
