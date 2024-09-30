import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for(int i = 0; i < size ; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i < arr.length; i++){
            int cnt = arr[i];
            for(int j = 0; j < cnt; j++){
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}