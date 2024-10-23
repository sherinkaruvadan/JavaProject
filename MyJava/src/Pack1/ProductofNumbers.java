package Pack1;
import java.util.*;

public class ProductofNumbers {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int pdt =1;
      for(int i=1;i<=n;i++)
      pdt*=i;
      
      
      System.out.println(pdt);
      sc.close();
  }
}