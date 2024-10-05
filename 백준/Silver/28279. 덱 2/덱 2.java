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
        Deque<Integer> deque = new LinkedList<>();
        int total = Integer.parseInt(br.readLine());

        for(int i = 0; i < total; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "1":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "4":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "5":
                    System.out.println(deque.size());
                    break;
                case "6":
                    if(deque.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                case "7":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case "8":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }
    }
}