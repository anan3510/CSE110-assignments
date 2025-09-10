//task 5
import java.util.Scanner;
public class Lab4_Task5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter starting number");
    int x = sc.nextInt();
    System.out.println("Enter ending number");
    int y = sc.nextInt();
    
    for(int a=x; a<=y; a++){
      int sum = 0;
      int n=0;
      int b = a;
      
      while(b!=0){
        b = b/10;
        n++;
      }
      
      b=a;
      for(int c=0; c<n; c++){
        int d = b%10;
        b = b/10;
        int f = (int)Math.pow(d, n);
        sum = sum + f;
      }
      
      
      if(sum==a){
        System.out.println(a);
      }
    }
    sc.close();
  }
}