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
        String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length() + 1; j++){
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set.size()-1);
    }
}