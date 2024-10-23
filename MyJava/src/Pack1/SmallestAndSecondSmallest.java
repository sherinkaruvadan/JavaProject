package Pack1;
import java.util.*;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      
      int smallest = Integer.MAX_VALUE;
      int second_small = Integer.MAX_VALUE;
      
      for(int i=0;i<n;i++){
        if(a[i]<smallest){
          second_small = smallest;
          smallest = a[i];
        }
        else if(a[i]<second_small && a[i]!=smallest){
          second_small = a[i];
        }
      }
      sc.close();
     // Arrays.sort(a);
      System.out.println(smallest);
      System.out.println(second_small); 
  }
}