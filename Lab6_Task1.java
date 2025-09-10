//task 1
import java.util.Scanner;
public class Lab6_Task1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int vl=0,cn=0;
    
    for(int i=0; i<s.length(); i++){
      int a = (int)s.charAt(i);
      
      if(a>=65 && a<=90 || a>=97 && a<=122){
        
        if(a==65|| a==69|| a==73|| a==79|| a==85|| a==97|| a==101|| a==105||  a==111|| a==117){
          vl++;
          
        }else{
          cn++;
        }
      }
    }
    if(vl%3==0 && cn%5==0){
      System.out.println("Aaarr! Me Plunder!!");
    }else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
}