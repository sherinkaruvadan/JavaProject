package Pack1;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      sc.close();
      int fact = 1;
      
      if(0<a && a<=100){
        for(int i=1;i<=a;i++){
          fact = fact*i;
        }
      }
      // else if(a == 0)
      // fact = 1
      
      System.out.println(fact);
  }
}