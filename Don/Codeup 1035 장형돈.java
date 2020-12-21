import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String i = sc.next();
		int b = Integer.valueOf(i, 16);
		System.out.printf("%o", b);
	}
}
