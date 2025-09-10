//task 2
import java.util.Scanner;
public class Lab4_Task2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length");
    int x = sc.nextInt();
    System.out.println("Enter width");
    int y = sc.nextInt();
    
    for(int a=0 ; a<y ; a++){
      for(int b=1 ; b<=x ; b++){
        System.out.print(b+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}