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
        String str = br.readLine();
        String[] arr = str.split("");

        for(int i = 0; i <arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int a = Integer.parseInt(arr[i]);
                int b = Integer.parseInt(arr[j]);
                if(a < b){
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(String var : arr){
            bw.write(var);
        }
        bw.flush();
    }
}