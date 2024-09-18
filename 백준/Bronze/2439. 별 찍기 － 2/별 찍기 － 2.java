import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= total; i++){
            int brcnt = total - i;
            for(int j = 1; j <= brcnt; j++){
                bw.write(" ");
            }
            for(int k = 0; k < i; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}