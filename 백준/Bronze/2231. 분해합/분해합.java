import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < num; i++)
		{
			int curr = i;
			int sum = 0;

			while (curr != 0)
			{
				sum += curr % 10;
				curr = curr / 10;
			}

			if (sum + i == num)
			{
				result = i;
				break;
			}
		}

		System.out.println(result);
	}
}