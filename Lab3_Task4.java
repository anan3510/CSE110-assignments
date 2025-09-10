//task4
import java.util.Scanner;
public class Lab3_Task4{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    int a = 0;
    int x = 0;
    int sum = 0;
    for( ; ; ){
      a++;
      if(a%2!=0){
        System.out.println(a);
        sum = sum + a;
        x++;
      }
      if(n==x){
        break;
      }
    }
    System.out.println("The Sum of odd Natural Numbers up to "+n+" terms is: " + sum);
    sc.close();
  }
}
