//task5
import java.util.Scanner;
public class Lab3_Task5{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    for(int a=1 ; a<=10 ; a++){
      System.out.println("Enter Number: ");
      int n = sc.nextInt();
      sum = sum + n;
      System.out.println("Sum = " + sum);
    }
    sc.close();
  }
}
      
      