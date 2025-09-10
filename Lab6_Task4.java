//task 4
import java.util.Scanner;
public class Lab6_Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean t = false;
    
    for(int x=0; x<s.length(); x++){
      
      if(s.length()<8){
        break;
      }
      
      for(int i=0; i<s.length(); i++){
        int a = (int)s.charAt(i);
        if(a>=65 && a<=90){
          t = true;
          break;
        }else{
          t = false;
        }
      }
      for(int i=0; i<s.length(); i++){
        int a = (int)s.charAt(i);
        if(a>=97 && a<=122){
          t = true;
          break;
        }else{
          t = false;
        }
      }
      for(int i=0; i<s.length(); i++){
        int a = (int)s.charAt(i);
        if(a>=48 && a<=57){
          t = true;
          break;
        }else{
          t = false;
        }
      }
      for(int i=0; i<s.length(); i++){
        int a = (int)s.charAt(i);
        if(a>=33 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96){
          t = true;
          break;
        }else{
          t = false;
        }
      }
    }
    System.out.println(t);
  }
}
      