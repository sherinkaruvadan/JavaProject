package Pack1;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rev ="";
      sc.close();
      for(int i=str.length()-1;i>=0;i--){
        rev= rev+str.charAt(i);
      }
      //for(String st : str){
        //rev= rev+st;
      //}
      System.out.println(rev);
  }
}