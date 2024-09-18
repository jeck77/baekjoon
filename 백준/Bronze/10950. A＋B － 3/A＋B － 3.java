import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int a = 0;
		int b = 0;
		N = sc.nextInt();
		
		for(int i = 0 ; i < N; i++) {
			System.out.print("");
			a = sc.nextInt();
			System.out.print("");
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
