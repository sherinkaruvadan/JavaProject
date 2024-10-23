package Pack1;
import java.util.*;

public class ArrangeArrayElements {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      sc.close();
      Arrays.sort(a);
      int left = 0;
      int right = n-1;
      
      for(int i=0;i<n;i++){
        if(i%2==0){
          b[i] = a[left];
          left++;
        }
        else{
          b[i] =a[right];
          right--;
        }
      }
      
      for(int i=0;i<n;i++)
      System.out.println(b[i]);
  }
}