import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int cnt = size / 4;
        
        for(int i = 0; i < cnt; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
