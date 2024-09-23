import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        
        int[] count = new int[26]; // 26개 알파벳
        
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 'A'; // A를 빼서 Z의 값을 넣어줌
            count[num]++;
        }
        
        int max = 0;
        char result = '?';
        for(int i = 0; i < count.length; i++){
            int target = count[i];
            if(target > max){
                max = target;
                result = (char) (i + 'A');
            }else if (max == target){
                result = '?';  
            }
        }
        System.out.println(result);
    }
}