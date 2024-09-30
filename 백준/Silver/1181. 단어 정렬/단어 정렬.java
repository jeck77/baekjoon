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
        int size = Integer.parseInt(br.readLine());
        Set<String> list = new HashSet<>();

        StringTokenizer st;

        for(int i = 0; i <size; i++){
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
        }

        String[] arr = new String[list.size()];
        int count = 0;
        for(String var : list){
            arr[count] = var;
            count++;
        }

        Arrays.sort(arr, (o1, o2) -> {
           if(o1.length() == o2.length()){
               return o1.compareTo(o2);
           }else{
               return o1.length() - o2.length();
           }
        });
        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i]+ "\n" );
        }
        bw.flush();
    }
}