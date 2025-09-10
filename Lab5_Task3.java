//task 3
import java.util.Scanner;
public class Lab5_Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    
    for(int l=1; l<=p; l++){
      
      for(int s=p-l; s>=1; s--){
        System.out.print(" ");
      }
      
       if(l==1 || l==p){
         for(int d=1; d<=(2*l-1); d++){
        System.out.print(d);
         }
       }else{
         for(int d=1; d<=(2*l-1); d++){
           if(d==1 || d==(2*l-1)){
             System.out.print(d);
           }else{
             System.out.print(" ");
           }
         }
       }
      
      System.out.println();
    }
  }
}