package Pack1;
import java.util.*;

public class PrintEvenNumbers {
    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     sc.close();
     
     if(0<=a && a<b && b<=100){
       int start = a+1;
       if(start%2!=0){
         start+=1;
       }
       for(int number = start; number<b;number+=2){
         System.out.println(number);
       }
     }
     else{
       System.out.println("Input does not meet constraints ");
     }
       
     //if(a%2 == 0 ){
       //for(int i=a+2; i<b; i+=2){
         //System.out.println(i);
       //}
     //}
      //else
      //{
       //for(int i=a+1; i<b; i+=2){
        // System.out.println(i);
       //}
     //}
  }
}
