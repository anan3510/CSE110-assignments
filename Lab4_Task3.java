//task 3
import java.util.Scanner;
public class Lab4_Task3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting number");
    int x = sc.nextInt();
    System.out.println("Enter ending number");
    int y = sc.nextInt();
    System.out.println("Prime numbers in this range:");
    for(int a=x ; a<=y ; a++){
      int count = 0;
      for(int b=2 ; b<a ; b++){
        if(a%b==0){
          count++; }
      }
      if(count==0){
          System.out.println(a);}
    }
    sc.close();
  }
}