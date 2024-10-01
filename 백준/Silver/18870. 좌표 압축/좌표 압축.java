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
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size]; // 일반배열
        int[] arrSort = new int[size]; // 정렬된 배열
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        for(int i = 0; i < size; i++){
            arr[i] = arrSort[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrSort);

        int rank = 0;
        for(int target : arrSort){
            if (!rankMap.containsKey(target)){
                rankMap.put(target, rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = rankMap.get(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i] + " " );
        }
        bw.flush();
    }
}