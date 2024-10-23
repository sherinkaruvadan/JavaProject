package Pack1;
import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String c = sc.next();
      sc.close();
      
      String result = str.replace(c,"");
      
      
      System.out.println(result);
  }
}