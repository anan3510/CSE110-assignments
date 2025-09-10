//task 5
import java.util.Scanner;
public class Lab5_Task5{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    
    for(int l=1; l<=p; l++){
      
      for(int s=p-l; s>=1; s--){
        System.out.print(" ");
      }
      for(int d=1; d<=l; d++){
        System.out.print(d);
      }
      for(int d=l-1; d>=1; d--){
        System.out.print(d);
      }
      System.out.println();
    }
  }
}
      
