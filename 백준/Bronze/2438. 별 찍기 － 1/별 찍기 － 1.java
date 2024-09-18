import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= total; i++){
            for(int j = 0; j < i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        br.close();
    }
}