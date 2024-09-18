import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Boolean isClose = false;
        StringTokenizer st;
        while(!isClose){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a == 0 && b == 0){
                isClose = true;
                br.close();
                bw.flush();
                bw.close();
            }else{
                bw.write((a + b) + "\n");
            }
        }
        
    }
}