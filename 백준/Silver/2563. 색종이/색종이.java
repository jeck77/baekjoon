import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];
		int total = sc.nextInt();
		int result = 0;
		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				arr[i][j] = 0;
			}
		}

		for (int k = 0; k < total; k++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i = n; i < n + 10; i++)
			{
				for (int j = m; j < m + 10; j++)
				{
					arr[i][j]++;
				}
			}
		}

		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				if (arr[i][j] > 0)
				{
					result++;
				}
			}
		}

		System.out.print(result);
	}
}