package Pack1;
import java.util.*;

public class PrintProduct {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      long product =1;
      sc.close();
      
      for(int i=1;i<10;i++){
        int num = sc.nextInt();
        product*=num;
      }
      

      System.out.println(product);
  }
}