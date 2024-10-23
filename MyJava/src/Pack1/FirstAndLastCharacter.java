package Pack1;
import java.util.*;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      char firstCharacter = str.charAt(0);
      char lastCharacter = str.charAt(str.length()-1);
      System.out.println(firstCharacter+""+ lastCharacter);
  }
}