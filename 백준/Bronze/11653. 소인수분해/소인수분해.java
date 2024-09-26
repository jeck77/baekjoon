import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 2; i < num; i++)
		{
			while (num % i == 0)
			{
				num /= i;
				sb.append(i + "\n");
			}
		}

		if (num != 1)
		{
			sb.append(num);
		}
		System.out.println(sb.toString());
	}
}