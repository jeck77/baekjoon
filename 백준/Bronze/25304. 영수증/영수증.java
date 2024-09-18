import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long total = sc.nextLong();
        int count = sc.nextInt();
        int result = 0;
        
        for(int i = 0; i < count; i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            result += price * cnt;
        }
        
        System.out.println(total == result ? "Yes" : "No");
        
    }
}