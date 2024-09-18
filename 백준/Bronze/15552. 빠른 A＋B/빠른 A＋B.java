import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer totalStr = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(totalStr.nextToken());
        
        for(int i = 0; i < total; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write((a + b) + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}