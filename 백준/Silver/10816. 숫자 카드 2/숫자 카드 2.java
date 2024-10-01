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

        int n = Integer.parseInt(br.readLine());
        HashMap <Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                map.replace(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                bw.write(map.get(num)  + " ");
            }else{
                bw.write("0 ");
            }
        }

        bw.flush();
    }
}