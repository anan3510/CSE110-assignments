//task7
import java.util.Scanner;
public class Lab3_Task7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    
    for( ; ; ){
      int x = a%10;
      System.out.print(x);
      
      a = a/10;
      
      if(a==0){
        break;}
      
      System.out.print(", ");
    }
    sc.close();
  }
}
      