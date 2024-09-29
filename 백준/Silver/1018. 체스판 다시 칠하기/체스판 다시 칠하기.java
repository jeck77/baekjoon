import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];

        // 보드 초기화
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        // 반복횟수
        int n_row = n - 7;
        int m_row = m - 7;
        int result = 999999;

        for(int i = 0; i < n_row; i++){
            for(int j = 0; j < m_row; j++){
                result = Math.min(result, find(arr, i, j));
            }
        }

        System.out.println(result);

    }

    public static int find(char[][] arr, int n, int m){
        char firstPattern = 'W'; // 첫 번째 패턴의 첫 색
        char secondPattern = 'B'; // 두 번째 패턴의 첫 색
        int firstPatternCount = 0;
        int secondPatternCount = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedColor = (i + j) % 2 == 0 ? firstPattern : secondPattern;
                if (arr[n + i][m + j] != expectedColor) {
                    firstPatternCount++;
                }

                expectedColor = (i + j) % 2 == 0 ? secondPattern : firstPattern;
                if (arr[n + i][m + j] != expectedColor) {
                    secondPatternCount++;
                }
            }
        }
        return Math.min(firstPatternCount, secondPatternCount);
    }
}