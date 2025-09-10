//Task 1
import java.util.Scanner;
  public class Lab2_Task1
  {
    public static void main(String []args)
    {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      
      if(a%5 == 0 && a%7 == 0){
        System.out.println("Invalid: Divisible by both");
      }
      else if(a%5 == 0 && a%7 != 0){
        System.out.println("Divisible by 5 Only");
      }
      else if(a%5 != 0 && a%7 == 0){
        System.out.println("Divisible by 7 Only");
      }
      else{
        System.out.println("No");
      }
      sc.close();
    }
  }