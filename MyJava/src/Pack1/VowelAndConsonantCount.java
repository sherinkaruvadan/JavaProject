package Pack1;
import java.util.*;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      int vowelCount=0;
      int consonantCount =0;
     // String regex = "\\d+";
     sc.close();
      
      char arry [] = str.toCharArray();
      
      for(char ch : arry){
        if(Character.isLetter(ch)){
        
        if(Character.toLowerCase(ch) == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch =='u')
          vowelCount++;
        else
        consonantCount++;
      }
      else if(Character.isDigit(ch))
      continue;
      }
      
      System.out.println("Vowel count: "+vowelCount);
      System.out.println("Consonant count: "+consonantCount);
  }
}