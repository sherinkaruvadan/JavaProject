package Pack1;
import java.util.*;

public class SplitString {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String arr[]=str.split(",");
      sc.close();
     // System.out.println(Arrays.toString(arr));
      for(String str1 : arr){
        System.out.println(str1);
      }
  }
}