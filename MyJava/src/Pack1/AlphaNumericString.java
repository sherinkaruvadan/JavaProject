package Pack1;

import java.util.*;

public class AlphaNumericString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      boolean hasLetter = false;
      boolean hasNumber = false;
      for(int i=0; i<str.length(); i++) {
        if(Character.isLetter(str.charAt(i)))
          hasLetter = true;
          else if(Character.isDigit(str.charAt(i)))
          hasNumber = true;
      }
        
      if(hasLetter && hasNumber)
      System.out.println("true");
      else
      System.out.println("false");
      
  }
}