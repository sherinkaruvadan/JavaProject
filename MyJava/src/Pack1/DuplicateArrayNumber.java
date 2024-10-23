package Pack1;

import java.util.*;

public class DuplicateArrayNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      
      for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
      boolean flag = true;
      sc.close();
      System.out.println(Arrays.toString(a));
      
      HashSet <Integer> hs = new HashSet <Integer>();
      
      for(int i : a){
        if(!hs.add(i)){
          flag = true;
         System.out.println(i); 
        }
        else {
          flag = false;
        }
      }
      if(!flag){
        System.out.println("The above number is duplicated");
      }
      else
      System.out.println("The numbers are unique");
  }
}