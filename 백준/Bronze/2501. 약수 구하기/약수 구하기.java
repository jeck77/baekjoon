import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int idx = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                list.add(i);
            }
        }
        
        if(list.size() == 0 || list.size() < idx){
            System.out.println(0);
        }else{
            System.out.println(list.get(idx-1));
        }
    }
}