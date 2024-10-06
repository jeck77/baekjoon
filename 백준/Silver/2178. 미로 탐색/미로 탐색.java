import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int[][] visited = new int[n][m];

        // visited 배열 초기화
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 0);
        }

        for(int i = 0; i < n; i++){
            String[] strArr = new StringTokenizer(br.readLine()).nextToken().split("");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        Queue<Pos> que = new LinkedList();
        Miro miro = new Miro(arr, visited, n, m);
        miro.visited[0][0] = 1;
        que.add(new Pos(0, 0));
        go(miro, que);

        System.out.println(miro.visited[n-1][m-1]);
    }

    public static class Miro{
        int[][] arr;
        int[][] visited;
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int n;
        int m;
        public Miro(int[][] arr, int[][] visited, int n, int m){
            this.arr = arr;
            this.visited = visited;
            this.n = n;
            this.m = m;
        }
    }

    public static class Pos{
        int x;
        int y;

        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void go(Miro miro, Queue que){
        while(!que.isEmpty()){
            Pos visit = (Pos) que.poll();
            int x = visit.x;
            int y = visit.y;

            for(int i = 0; i < 4; i++){
                int nx = x + miro.dx[i];
                int ny = y + miro.dy[i];
                if(nx < 0 || ny < 0 || nx >= miro.n || ny >= miro.m) {continue;}
                if(miro.arr[nx][ny] != 1) continue;
                if(miro.visited[nx][ny] != 0) continue;
                miro.visited[nx][ny] = miro.visited[x][y] + 1;
                que.add(new Pos(nx, ny));
            }
        }
    }
}