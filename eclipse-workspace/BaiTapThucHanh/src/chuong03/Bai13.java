package chuong03;

public class Bai13 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Vui long nhap tham so n tu command line!");
			return;
		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap n:");
//		int n = scanner.nextInt();
		
		int n = Integer.parseInt(args[0]);
//		int sum = 0;
//		for (int i=0; i<=n; i++) {
//			sum += i;
//		}
		int sum = n * (n+1)/2;
		System.out.println("Tong so tu 1+2+3+...+ " + n + "=" +sum); 

	}

}
