import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] arr = new int[total];
		for (int i = 1; i <= arr.length; i++)
		{
			arr[i - 1] = i;
		}
		int count = sc.nextInt();

		for (int i = 0; i < count; i++)
		{
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			int temp = arr[a];
			int temp2 = arr[b];

			arr[a] = temp2;
			arr[b] = temp;
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
    }
}