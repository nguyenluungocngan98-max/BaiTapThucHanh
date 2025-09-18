package chuong03;

public class Bai21 {

	public static String tachChuoi (String s) {
		String[] words = s.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			result.append(word).append("\n");
		}
		return result.toString();

	}
	public static void main(String[] args) {
		String S = "Bai Tap Mon Lap Trinh Java";
		String ketqua = tachChuoi(S);
		System.out.println("Chuoi sau khi tach la:");
		System.out.println(ketqua);
	}

}
