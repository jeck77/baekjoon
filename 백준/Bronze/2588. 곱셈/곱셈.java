import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 첫번째 수
        int a = sc.nextInt();
        // 두번째 수
        int b = sc.nextInt();
        
        int first = b % 10;
        int second = (b / 10) % 10;
        int thrid = (b / 100) % 10;
        
        int result1 = a * first;
        int result2 = a * second;
        int result3 = a * thrid;
        int result4 = a * b;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}