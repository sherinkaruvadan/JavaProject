package Pack1;
import java.util.*;

public class LastCharacterString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(str.charAt(str.length()-1));
      sc.close();
  }
}