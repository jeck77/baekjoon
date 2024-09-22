import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        int num = 97; // a

        for(int i = 0; i <= 25; i++){
            char ch = (char)(num + i);
            bw.write(Integer.toString(target.indexOf(ch)) + " ");
        }
        bw.flush();
    }
}