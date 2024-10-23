package Pack1;
import java.util.*;

public class StringCompare {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      
     // str1 = str1.toLowerCase();
     // str2 = str2.toLowerCase();
     sc.close();
      
      if(str1.equalsIgnoreCase(str2))
      System.out.println("true");
      else
      System.out.println("false");
  }
}