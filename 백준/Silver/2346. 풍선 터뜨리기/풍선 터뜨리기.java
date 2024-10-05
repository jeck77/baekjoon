import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> deque = new ArrayDeque<>();

        int total = Integer.parseInt(br.readLine()); // 총 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= total; i++){
            Balloon balloon = new Balloon(i, Integer.parseInt(st.nextToken()));
            deque.add(balloon);
        }
        br.close();

        // 첫번째
        Balloon target = deque.poll();
        int move = target.move;
        sb.append("1 ");

        while(!deque.isEmpty()){
            if(move > 0){
                // 1보다 클 경우
                for(int i = 1; i < move; i++){
                    deque.add(deque.poll());
                }
                target = deque.poll();
            }else{
                // 1보다 작을 경우
                for(int i = 1; i < -move; i++){
                    deque.addFirst(deque.pollLast());
                }
                target = deque.pollLast();
            }
            move = target.move;
            sb.append(target.index + " ");
        }

        System.out.println(sb);
    }

    public static class Balloon{
        int index;
        int move;

        public Balloon (int index, int move){
            this.index = index;
            this.move = move;
        }
    }
}