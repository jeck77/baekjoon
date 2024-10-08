import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//
public class Main {
    public static int[][] arr;
    public static boolean[] visited;
    public static int n;
    public static StringBuilder sb = new StringBuilder();
    public static Queue<Integer> que = new LinkedList<>();

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        visited = new boolean[n + 1];
        dfs(v);
        visited = new boolean[n + 1];
        System.out.println("");
        bfs(v);
    }

    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i < arr.length; i++){
            if(arr[v][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }


    private static void bfs(int v) {
        que.add(v);
        visited[v] = true;
        System.out.print(v + " ");
        while(!que.isEmpty()){
            int start = que.poll();
            for(int i = 1; i < arr.length; i++){
                if(arr[start][i] == 1 && visited[i] == false){
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}