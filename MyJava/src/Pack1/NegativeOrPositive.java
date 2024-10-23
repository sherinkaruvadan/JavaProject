package Pack1;
import java.util.*;

public class NegativeOrPositive {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
     
      if(a<0)
      System.out.println("negative");
      else
      System.out.println("positive");
      sc.close();
  }
}