//task 7
import java.util.Scanner;
public class Lab5_Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    int a=p,b=p-1;
    for(int l=0; l<p; l++){
      
      for(int s=1; s<=l; s++){
        System.out.print(" ");
      }
      
      for(int d=1; d<=a; d++){
        System.out.print(d);
      }
      a--;
      for(int d=b; d>=1; d--){
        System.out.print(d);
      }
      b--;
      
      System.out.println();
    }
    for(int l=2; l<=p; l++){
      
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