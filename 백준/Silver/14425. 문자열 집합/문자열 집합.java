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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> list = new HashSet<>();
        // set
        for(int i = 0; i < n; i++){
            list.add(br.readLine());
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            if(list.contains(br.readLine())){
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}