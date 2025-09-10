//Task 3
import java.util.Scanner;
public class Lab2_Task3
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please 1st Number");
    float a = sc.nextFloat();
    
    float max = a;
    float min = a;
    
    System.out.println("Please 2nd Number");
    float b = sc.nextFloat();
    
    if(b>max){
      max = b;
    }
    if(b<min){
      min = b;
    }
    
    System.out.println("Please 3rd Number");
    float c = sc.nextFloat();
    
    if(c>max){
      max = c;
    }
    if(c<min){
      min = c;
    }
    sc.close();
    System.out.println("Maximum number is " + max);
    System.out.println("Minimum number is " + min);
  }
}