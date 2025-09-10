//task 1
import java.util.Scanner;
public class Lab5_Task1
{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    
    for(int l=1; l<=p; l++){
      
      for(int s=p-l; s>=1; s--){
        System.out.print(" ");
      }
      
      for(int d=1; d<=(2*l-1); d++){
        System.out.print(d);
      }
      
      System.out.println();
    }
    
    int a=2*p-3;
    
    for(int l=1; l<=p-1; l++){
      
      for(int s=1; s<=l; s++){
        System.out.print(" ");
      }
      
      for(int d=1; d<=a; d++){
        System.out.print(d);
      }
       a-=2;
      
      System.out.println();
    }
  }
}