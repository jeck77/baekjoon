import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String target = br.readLine();
            bw.write(String.valueOf(target.charAt(0)) + String.valueOf(target.charAt(target.length() - 1)) + "\n");
        }
        bw.flush();
    }
}