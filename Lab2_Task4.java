//Task 4
import java.util.Scanner;
public class Lab2_Task4
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the 1st Side");
    int a = sc.nextInt();
    System.out.println("Please enter the 2nd Side");
    int b = sc.nextInt();
    System.out.println("Please enter the 3rd Side");
    int c = sc.nextInt();
    
    int eql_side = 0;
    
     if(a==b){
       eql_side++;
     }
     if(b==c){
       eql_side++;
     }
     if(c==a){
       eql_side++;
     }
     
     if(eql_side == 0){
       System.out.print("This is a Scalene triangle.");
     }else if(eql_side == 1){
       System.out.print("This is an Isosceles triangle.");
     }else{
       System.out.print("This is an Equilateral  triangle.");
     }
     sc.close();
  }
}
