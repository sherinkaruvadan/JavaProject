package Pack1;
import java.util.*;

public class UppercaseCheck {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean allUpperCase = true;
      
      for(char ch : str.toCharArray()){
        if(Character.isLetter(ch)){
          if(!Character.isUpperCase(ch)){
            allUpperCase = false;
            break;
          }
        }
      }
      sc.close();
      if(allUpperCase)
      System.out.println(true);
      else
      System.out.println(false);
  }
}