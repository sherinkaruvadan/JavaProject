package Pack1;
import java.util.*;

public class PrintOddNumbers {
    public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     sc.close();
     int count =0;
     
     if(0<=a && a<b && b<=100){
       int start = a;
        if(a%2 == 0){
         start = a+1;
       }
       for(int number = start; number<=b; number+=2){
         count++;
       }
       
       
     }
      
      System.out.println(count);
  }
}