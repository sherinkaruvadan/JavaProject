package Pack1;
import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      String vowels = "[aeiouAEIOU]";
      String modified = str.replaceAll(vowels, "");
      System.out.println(modified);
  }
}