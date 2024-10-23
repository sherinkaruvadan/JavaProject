package Pack1;
import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String searchWord = sc.nextLine();
      
      boolean search = false;
      
      String words[] = str.split(" ");
      sc.close();
      
      for(String word : words){
        if(searchWord.equals(word)){
          search = true;
          break;
        }
      }
      if(search)
      System.out.println(true);
      else
      System.out.println(false);
      
     // System.out.println("Hello, World!");
  }
}