import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = num;
		for (int i = 0; i < num; i++)
		{
			String str = sc.next();
			boolean[] check = new boolean[26];

			for (int j = 0; j < str.length() - 1; j++)
			{
				int curr = str.charAt(j);
				int next = str.charAt(j + 1);
				// 현재 글자와 다음 글자가 다르다면
				if (curr != next)
				{
					if (check[next - 'a'] == true)
					{
						count--;
						break;
					}
					check[curr - 'a'] = true;
				}
			}
		}
		System.out.println(count);
	}
}