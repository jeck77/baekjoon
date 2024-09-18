import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int sum = 0;
		N = sc.nextInt();
		
		for(int i = 0 ; i < N+1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
