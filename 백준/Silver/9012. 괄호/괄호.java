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
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            String str = br.readLine();
            System.out.println(solve(str));

        }
    }

    public static String solve (String str) {
        Stack<Character> stack = new Stack<>();
        String result = "NO";
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            if (c == '(') {
                stack.push('(');
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}