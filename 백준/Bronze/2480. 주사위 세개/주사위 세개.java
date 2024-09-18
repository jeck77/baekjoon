import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    // 첫번째 주사위
        int b = sc.nextInt();    // 두번째 주사위
        int c = sc.nextInt();    // 세번째 주사위
        int result = -1;
        if(a == b && b == c){
            // 3개가 모두 같을 때
            result = 10000 + a * 1000;
        }else if ((a == b) || (a == c)){
            result = 1000 + a * 100;
        }else if (b == c){
            result = 1000 + b * 100;
        }else{
            int max = Math.max(a, Math.max(b,c));
            result = max * 100;
        }
        
        System.out.println(result);
    }
}