import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int max = -1000001;
		int min = 1000001;
        
        for(int i = 0; i < total; i++){
            max = Math.max(max, Integer.parseInt(strs[i]));
            min = Math.min(min, Integer.parseInt(strs[i]));
        }
        
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}