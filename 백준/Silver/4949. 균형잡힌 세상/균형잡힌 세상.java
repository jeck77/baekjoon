import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String s;
        while(true){
            s = br.readLine();
            //종료 조건 "." 하나 입력
            if(s.equals(".")){
                break;
            }

            System.out.println(checkStr(s));
        }

        //String str;
        //while((str = br.readLine()) != null){
        //    System.out.println(checkStr(str));
        //}
    }

    public static String checkStr(String str){
        Stack<Character> stack = new Stack();

        for(int i = 0; i < str.length(); i++){
            Character a = str.charAt(i);
            if(a == '(' || a == '['){
                stack.push(a);
            }else if (a == ')'){
                if(stack.isEmpty() ||stack.peek() == '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }else if (a == ']'){
                if(stack.isEmpty() ||stack.peek() == '('){
                    return "no";
                }else{
                    stack.pop();
                }
            }else{
                continue;
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }else{
            return "no";
        }
    }
}