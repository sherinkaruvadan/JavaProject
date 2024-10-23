package Pack1;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      
      int year = sc.nextInt();
      if(year%4==0)
      System.out.println("yes");
      else
      System.out.println("no");
      sc.close();
  }
}