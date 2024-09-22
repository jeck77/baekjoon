import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
		String b = sc.next();
        
        a = new StringBuilder().append(a).reverse().toString();
        b = new StringBuilder().append(b).reverse().toString();
        
        System.out.println(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
    }
}