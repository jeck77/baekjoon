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
        int cnt = 0;
        int num = 666;
        boolean isEnd = true;
        while(isEnd){
            if(Integer.toString(num).contains("666")){
                cnt++;
                if(cnt == n){
                    System.out.println(num);
                    isEnd =false;
                }
            }
            num++;
        }
    }
}