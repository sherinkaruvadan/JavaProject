package Pack1;

import java.util.*;

public class ArrayNumberCheck {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int a[] = new int[n];
      
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      
      int num = sc.nextInt();
      sc.close();
      boolean ispresent = false;
      for(int i=0;i<n;i++){
        if(a[i]==num){
          ispresent =true;
          break;
        }
      }
      
       if (ispresent) {
            System.out.println("PRESENT");
        } else {
            System.out.println("NOT PRESENT");
        }

    }
}