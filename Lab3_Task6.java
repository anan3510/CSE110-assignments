//task6
import java.util.Scanner;
public class Lab3_Task6{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
    System.out.println("Divisors of "+ n +":");
    for(int a=1 ; a<=n ; a++){
      if(n%a==0){
        System.out.println(a);
      }
    }
    sc.close();
  }
}