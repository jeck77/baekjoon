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
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int result1 = Integer.parseInt(st.nextToken());

        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int result2 = Integer.parseInt(st.nextToken());

        for(int i = -999; i <= 999; i++){
            for(int j = -999; j <= 999; j++){
                if(x1*i + y1 * j == result1){
                    if(x2 * i + y2 * j == result2){
                        bw.write(i + " " + j);
                    }
                }
            }
        }
        bw.flush();
    }
}