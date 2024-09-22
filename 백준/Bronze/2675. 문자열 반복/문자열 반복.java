import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String target = st.nextToken();
            
            for(int j = 0; j < target.length(); j++){
                for(int k = 0; k < repeat; k++){
                    bw.write(String.valueOf(target.charAt(j)));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}