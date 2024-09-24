import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[15][15];
		int num = 0;

		while (sc.hasNext())
		{
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++)
			{
				arr[num][j] = Character.toString(str.charAt(j));
			}
			num++;
		}

		for (int j = 0; j < 15; j++)
		{
			for (int i = 0; i < 15; i++)
			{
				if (arr[i][j] != null)
				{
					System.out.print(arr[i][j]);
				}
			}
		}
	}
}