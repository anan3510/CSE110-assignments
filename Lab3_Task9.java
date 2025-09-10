//task9
import java.util.Scanner;
public class Lab3_Task9{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    int div = 0;
    for(int a=1 ; a<=n ; a++){
      if(n%a==0){
        div++;
      }
    }
    if(div<3){
        System.out.println(n + " is a prime number");
      }else{
        System.out.println(n + " is not a prime number");
      }
      int sum = 0;
    for(int a=1 ; a<n ; a++){
      if(n%a==0){
        sum = sum + a;
      }
    }
    if(sum==n){
      System.out.println(n + " is a perfect number");
    }else{
      System.out.println(n + " is not a perfect number");
    }
    sc.close();
  }
}

      
        