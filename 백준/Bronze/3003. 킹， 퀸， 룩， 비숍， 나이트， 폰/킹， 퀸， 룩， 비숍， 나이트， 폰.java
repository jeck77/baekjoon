import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] ori = {1, 1, 2, 2, 2, 8};

		int[] arr = new int[6];
		for (int i = 0; i < 6; i++)
		{
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 6; i++)
		{
			System.out.print(ori[i] - arr[i] + " ");
		}
	}
}