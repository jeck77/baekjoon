import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String ori = sc.next();
		StringBuilder sb = new StringBuilder().append(ori).reverse();
		String rev = sb.toString();

		System.out.println(ori.equals(rev) ? 1 : 0);
	}
}