//task 4
import java.util.Scanner;
public class Lab4_Task4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of customers");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      System.out.println("Enter number of items for customer "+ a);
      int k = sc.nextInt();
      double sum = 0;
      double avg = 0;
      for(int b=1; b<=k; b++){
        System.out.println("Enter price of item " + b);
        int item = sc.nextInt();
        sum = sum + item;
      }
      avg = sum/k;
      System.out.println("Average for Customer-"+a+": " + avg);
    }
    sc.close();
  }
}