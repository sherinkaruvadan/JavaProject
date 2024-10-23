package Pack1;
import java.util.*;

public class LowerCaseCheck {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      boolean allLowerCase = true;
      
      for(char ch : str.toCharArray()){
        if(Character.isLetter(ch)){
          if(!Character.isLowerCase(ch)){
            allLowerCase = false;
            break;
          }
        }
      }
      sc.close();
      if(allLowerCase)
      System.out.println(true);
      else
      System.out.println(false);
  }
}