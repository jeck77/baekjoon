import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        int count = sc.nextInt();
        // 배열 초기화
        int[] arr = new int[total];

        while (sc.hasNextInt()) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt();

            for(int j = start; j <= end; j++){
                arr[j-1] = number;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}