//task3
import java.util.Scanner;
public class Lab3_Task3{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter a number");
    int n = sc.nextInt();
   
    int pos=0;
    int neg=0;
   
    for(int a=0 ; a<n ; a++){
      System.out.println("Enter a number");
      int d = sc.nextInt();
      if(d>=0){
        pos++;
      }else{
        neg++;
      }
    }
    sc.close();
    System.out.println(pos + " Non-negative Numbers");
    System.out.println(neg + " Negative Numbers");
  }
}