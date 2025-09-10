//task8
import java.util.Scanner;
public class Lab3_Task8{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int count = 0;
    int x = a;
    
    for( ; ; ){
      x = x/10;
      count++;
      if(x==0){
        break;
      }
    }
    
    int div = 1;
    while(count>1){
      div = div*10;
      count--;
    }
    
    for( ; ; ){
      int b = a/div;
      System.out.print(b);
      
      a = a%div;
      div = div/10;
      if(a==0){
        break;}
      
      System.out.print(", ");
    }
    sc.close();
  }
}
    
    