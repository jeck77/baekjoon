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
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            set2.add(Integer.parseInt(st.nextToken()));
        }

        HashSet tmp = (HashSet) set.clone();
        HashSet tmp2 = (HashSet) set2.clone();

        for(Integer key : set){
            tmp2.remove(key);
        }

        for(Integer key : set2){
            tmp.remove(key);
        }

        bw.write(Integer.toString(tmp.size() + tmp2.size()));
        bw.flush();
    }
}