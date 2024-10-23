package Pack1;
import java.util.*;

public class DoubleArrayElements {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      sc.close();
      for(int i=0;i<n;i++){
        b[i] = a[i]*2;
        System.out.println(b[i]);
      }
  }
}