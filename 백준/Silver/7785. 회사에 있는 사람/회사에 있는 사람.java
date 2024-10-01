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
        int n = Integer.parseInt(br.readLine());
        HashSet<String> user = new HashSet<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String where = st.nextToken();

            if (where.equals("enter")) {
                user.add(name);
            } else {
                user.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<>();

        for(String str : user){
            list.add(str);
        }
        Collections.sort(list, Collections.reverseOrder());

        for(String str : list){
            bw.write(str + "\n");
        }

        bw.flush();
    }
}