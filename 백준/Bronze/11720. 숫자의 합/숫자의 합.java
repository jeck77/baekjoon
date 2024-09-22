import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        String target = sc.next();
        int result = 0;
       
        for(int i = 0; i < total; i++){
            result += Integer.parseInt(String.valueOf(target.charAt(i)));
        }
        System.out.println(result);
    }
}