package Pack1;
import java.util.*;

public class ReverseCharacterCase {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String result="";
      char Arr[] = str.toCharArray();
      sc.close();
      //System.out.println(Arrays.toString(Arr));
      for(char s : Arr){
        if(Character.isUpperCase(s))
        result = result + Character.toLowerCase(s);
        else
        result = result + Character.toUpperCase(s);
        
      }
      
      System.out.println(result);
  }
}