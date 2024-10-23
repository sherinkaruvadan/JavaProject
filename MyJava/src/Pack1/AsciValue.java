package Pack1;

import java.util.*;

public class AsciValue {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char Arry[] = str.toCharArray();
      sc.close();
      
      for( char ch : Arry)
      System.out.println((int)ch);
  
      //System.out.println(str);
  }
}