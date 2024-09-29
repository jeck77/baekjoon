import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int small = 3;
        int large = 5;
        int result = 999999;
        int tmp = 0;

        int count = n / large;

        for (int i = count; i > -1; i--){
            int num = n - (large * i);
            if(num % small == 0) {
                tmp = i + (num / small);
                result = Math.min(tmp, result);
            }
        }

        if(result == 999999){
            result = -1;
        }

        System.out.println(result);
    }
}