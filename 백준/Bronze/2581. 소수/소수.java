import java.util.*;

public class Main{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = 0;
		int sum = 0;
		int count = 0;

		boolean isFirst = true;

		for (int i = n; i <= m; i++)
		{
			if (i != 0 && i != 1)
			{
				boolean isPrime = true;
				for (int j = 2; j < i; j++)
				{
					if (i % j == 0)
					{
						isPrime = false;
					}
				}
				if (isPrime)
				{
					if (isFirst)
					{
						min = i;
						isFirst = false;
					}
					sum += i;
					count++;
				}
			}
		}
		if (count == 0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}