package Pack1;

import java.util.*;

public class CompareStringLength {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      sc.close();
      if(str1.length()==str2.length())
      System.out.println(true);
      else
      System.out.println(false);
  }
}