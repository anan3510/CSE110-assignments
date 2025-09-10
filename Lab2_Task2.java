//Task 2
import java.util.Scanner;
public class Lab2_Task2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter Payment");
    int payment = sc.nextInt();
    
    System.out.println("Please Enter Age");
    int age = sc.nextInt();
    
    if(age >= 18){
      if(payment < 10000){
        System.out.println("Your tax amounts is 0 Tk");
      }
      else if(payment == 10000 || payment <= 20000){
        int tax = ((payment/100)*5);
        System.out.println("Your tax amounts is " + tax + "Tk");
      }
        else if(payment > 20000){
        int tax = ((payment/100)*10);
        System.out.println("Your tax amounts is " + tax + "Tk");
      }
    }
    else{
      System.out.println("Your tax amounts is 0 Tk");
    }
    sc.close();
  }
}