//Task 6
import java.util.Scanner;
public class Lab2_Task6
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int eql_num = 0;
    
    if(a==b){
      eql_num++;
    }
    if(b==c){
      eql_num++;
    }
    if(c==a){
      eql_num++;
    }
    
    if(eql_num == 0){
      System.out.print("All numbers are different");
    }
    else if(eql_num == 1){
      System.out.print("Neither all are equal or different");
    }
    else{
      System.out.print("All numbers are equal");
    }
    sc.close();
  }
}