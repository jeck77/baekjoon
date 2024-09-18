import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());
        int count = 0;
        for(String str : arr){
            if(target == Integer.parseInt(str)){
                count++;
            }
        }
        
        bw.write(Integer.toString(count));
        bw.flush();
        br.close();
        bw.close();
    }
    
}