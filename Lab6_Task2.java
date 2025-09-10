//task 2
import java.util.Scanner;
public class Lab6_Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String s3 = "";
    String s4 = "";
    boolean f = false;
    
    for(int i=0; i<s1.length(); i++){
      int a = (int)s1.charAt(i);
      
      for(int j=0; j<s2.length(); j++){
        int b = (int)s2.charAt(j);
      
        if(a==b){
          f = false;
          break;
        }else{
          f = true;
        }
      }
      if(f){
        s3+=s1.charAt(i);
        f = false;
      }
    }
    for(int i=0; i<s2.length(); i++){
      int a = (int)s2.charAt(i);
      
      for(int j=0; j<s1.length(); j++){
        int b = (int)s1.charAt(j);
      
        if(a==b){
          f = false;
          break;
        }else{
          f = true;
        }
      }
      if(f){
        s3+=s2.charAt(i);
      }
    }
    for(int i=0; i<s3.length(); i++){
      int a = (int)s3.charAt(i);
      
      a-=32;
      s4=s4+(char)a;
    }
    System.out.println(s4);
  }
}
        