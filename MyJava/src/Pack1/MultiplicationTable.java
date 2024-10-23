package Pack1;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      sc.close();
      
      if(0<a && a<=100){
        for(int i =1;i<=10;i++){
          System.out.println(a+"*"+i+"="+(a*i));
        }
      }
      else
      System.out.println("Invalid input");
  }
}