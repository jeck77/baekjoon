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
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if(set.contains(str)){
                list.add(str);
            }
        }

        Collections.sort(list);

        bw.write(Integer.toString(list.size())+ "\n");
        for(String name : list){
            bw.write(name + "\n");
        }
        bw.flush();
    }
}