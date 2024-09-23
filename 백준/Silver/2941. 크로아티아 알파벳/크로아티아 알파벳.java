import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String[] change = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < change.length; i++){
            if(str.contains(change[i])){
                str = str.replace(change[i], "@");
            }
        }
        System.out.println(str.length());
    }
}