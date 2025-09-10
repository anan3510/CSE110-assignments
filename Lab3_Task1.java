//task1
import java.util.Scanner;
public class Lab3_Task1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
   
    int n = sc.nextInt();
   
      for(int a=0; a<=n ; a++){
     
      if(a%5==0){
        if(a%3!=0){
          System.out.println(a);
        }
      }
    }
    sc.close();
  }
}