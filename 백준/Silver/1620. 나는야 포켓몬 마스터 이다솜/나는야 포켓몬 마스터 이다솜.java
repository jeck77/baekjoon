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
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for(int i = 0; i < n; i++){
            String str =br.readLine();
            map.put(str, i + 1);
            map2.put(i + 1, str);
        }

        for(int i = 0; i < m; i++){
            String str = br.readLine();
            if(isNumber(str)){
                bw.write(map2.get(Integer.parseInt(str)) + "\n");
            }else{
                bw.write(map.get(str) + "\n");
            }
        }
        // bw.write(str + "\n");
        bw.flush();
    }

    public static boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}