import java.util.*;

public class Main{
    
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int[] arr = new int[total];
		for (int i = 1; i <= total; i++)
		{
			arr[i - 1] = i;
		}

		int count = sc.nextInt();

		int temp = 0;

		for (int k = 0; k < count; k++)
		{
			int s = sc.nextInt() - 1;
			int e = sc.nextInt() - 1;

			while (s < e)
			{
				temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}