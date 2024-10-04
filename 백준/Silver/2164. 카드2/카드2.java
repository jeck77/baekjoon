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

        LinkedList<Integer> que = new LinkedList<>();

        for(int i = 1; i <= count; i++){
            que.add(i);
        }

        while(que.size() != 1){
            que.poll(); // 첫번쨰 카드 버림
            int tmp = que.poll(); // 제일 아래로 옮길 카드
            que.add(tmp);
        }
        System.out.println(que.poll());
    }
}