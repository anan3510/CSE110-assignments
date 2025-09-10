//task 4
import java.util.Scanner;
public class Lab5_Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    
    for(int l=1; l<=p; l++){
      
      for(int s=p-l; s>=1; s--){
        System.out.print(" ");
      }
      
      if(l==1){
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
    
    int a=2*p-3;
    
    for(int l=1; l<=p-1; l++){
      
      for(int s=1; s<=l; s++){
        System.out.print(" ");
      }
      if(l==p-1){
        for(int d=1; d<=a; d++){
        System.out.print(d);
        }
      }else{
        for(int d=1; d<=a; d++){
          if(d==1 || d==a){
            System.out.print(d);
          }else{
            System.out.print(" ");
          }
        }
      }
      
       a-=2;
      
      System.out.println();
    }
  }
}