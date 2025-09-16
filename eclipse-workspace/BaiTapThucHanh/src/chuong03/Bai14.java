package chuong03;

public class Bai14 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Vui long nhap tham so n tu command line!");
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap n:");
//		int n = scanner.nextInt();
		int sum = 0;
		if (n%2==0) {
			System.out.printf("Tong 1+3+5... " + n + "=");
			for(int i=1; i<=n; i+= 2) {
				sum += i;
			}
		} else {
			System.out.printf("Tong 2+4+6..." + n + "=");
			for(int i=2; i<=n; i+=2) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
