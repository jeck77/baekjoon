import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);

        int use = sc.nextInt();
        int useHour = use / 60;
        int useMin = use % 60;
        
        int addHour = hour + useHour;
        int addMin = min + useMin;
        
        if(addMin >= 60){
            addHour = addHour + 1;
            addMin = addMin - 60; 
        }
        
        if(addHour >= 24){
            addHour = addHour - 24;
        }
        
         System.out.println(addHour + " " + addMin);
    }
}
