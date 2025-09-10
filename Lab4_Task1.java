//task 1
import java.util.Scanner;
public class Lab4_Task1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of test cases");
    int n = sc.nextInt();
    
    for(int a=0; a<n ; a++){
      System.out.println("Enter 1st test cases");
      int x = sc.nextInt();
      System.out.println("Enter 2nd test cases");
      int y = sc.nextInt();
      int sum = 0;
      
      for(int b=0; b<y ; b++){
        if(x%2==0){
          x++;
        }
        sum = sum + x;
        x = x+2;
      }
      System.out.println("Sum = " + sum);
    }
    sc.close();
  }
}
        
      
  