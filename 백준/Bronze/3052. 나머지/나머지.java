import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < 10; i++){
            int input = sc.nextInt();
            set.add(input % 42);
        }
        
        System.out.println(set.size());
    }
}