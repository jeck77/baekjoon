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
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < count; i++){
            int num = Integer.parseInt(br.readLine());
            switch (num){
                case 0 :
                    stack.pop();
                    break;
                default:
                    stack.push(num);
                    break;
            }
        }

        int sum = 0;
        while(stack.size() > 0){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}