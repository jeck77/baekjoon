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
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(solve(count, st));
    }

    public static String solve (int count, StringTokenizer st){
        Stack<Integer> stack = new Stack<>();
        int now = 1;
        for(int i = 0; i < count; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (now == num){
                now++;
                while(!stack.isEmpty()){
                    if(stack.peek() == now){
                        stack.pop();
                        now++;
                    }else{
                        break;
                    }
                }
            }else{
                stack.push(num);
            }
        }

        return stack.isEmpty() ? "Nice" : "Sad";
    }
}