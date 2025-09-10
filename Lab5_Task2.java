//task 2
import java.util.Scanner;
public class Lab5_Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int p = sc.nextInt();
    int a = p;
    for(int l=1; l<=p; l++, a--){
      
      for(int s=0; s<a-1; s++){
        System.out.print(" ");
      }
      
      if(l==1 ||l==2||l==p){
        for(int d=a; d<=p; d++){
        System.out.print(d);
      }
      }else{
        for(int d=a; d<=p; d++){
          if(d==a||d==p){
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
      