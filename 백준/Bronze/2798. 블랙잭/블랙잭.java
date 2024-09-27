import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int total = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		boolean[] isUse = new boolean[num];
		int max = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
			isUse[i] = false;
		}

		for (int i = 0; i < num - 2; i++)
		{
			for (int j = i + 1; j < num - 1; j++)
			{
				for (int k = j + 1; k < num; k++)
				{
					int a = arr[i];
					int b = arr[j];
					int c = arr[k];
					int result = a + b + c;
					if (result <= total)
					{
						max = Math.max(result, max);
					}
				}
			}
		}

		System.out.println(max);
	}
}