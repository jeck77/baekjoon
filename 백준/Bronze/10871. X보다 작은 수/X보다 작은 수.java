import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < total; i++){
            int curr = Integer.parseInt(arr[i]);
            if(curr < target){
                bw.write(curr + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}