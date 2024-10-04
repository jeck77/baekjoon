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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        LinkedList<Integer> que = new LinkedList<>(); // 남은 사람
        LinkedList<Integer> removeQue = new LinkedList<>(); // 제거된 사람
        for(int i = 1; i <= size; i++){
            que.add(i);
        }

        int index = 1;
        while(que.size() != 0){
            int tmp = que.poll(); // 값을 꺼냄
            if(index % target != 0){
                que.add(tmp); // 해당 카겟이 아닐 경우 다시 넣어줌
            }else{
                removeQue.add(tmp); // 해당 인덱스면 remove에 넣어줌
            }
            index++;
        }
        String result = removeQue.toString().replace("[", "<").replace("]", ">");
        System.out.println(result);
    }
}