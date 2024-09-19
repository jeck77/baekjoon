import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i = 1; i <= 30; i++){
            arr[i-1] = i;
        }
        
        for(int i = 0; i < 28; i++){
            int a = sc.nextInt();
            arr[a - 1] = -1;
        }
        
        
        int name1 = -1;
        int name2 = -1;
        
        for(int i = 0; i < 30; i++){
            if(arr[i] != -1){
                if(name1 == -1){
                    name1 = arr[i];
                }else{
                    name2 = arr[i];
                }
            }
        }
        
        System.out.println(Math.min(name1, name2));
        System.out.println(Math.max(name1, name2));
    }
}