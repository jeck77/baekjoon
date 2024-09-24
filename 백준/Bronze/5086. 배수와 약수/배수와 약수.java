import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = "neither";
            if(a != 0 && b != 0){
                if(a < b){
                    if(b % a == 0){
                       result = "factor";
                    }
                }else if(a > b){
                    if(a % b == 0){
                       result = "multiple";
                    }
                }
                System.out.println(result);
            }
        }
    }
}