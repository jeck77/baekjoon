import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] < arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        System.out.println(arr[cut - 1]);
    }
}