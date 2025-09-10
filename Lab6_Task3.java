//task 3
import java.util.Scanner;
public class Lab6_Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = "",s2 = "";
    
    for(int i=0; i<s.length(); i++){
      int a = (int)s.charAt(i);
      
      if(a>=65 && a<=90){
        a+=32;
        s1=s1+(char)a;
      }else{
        s1=s1+(char)a;
      }
    }
    
    for(int i=0,j=0; i<s1.length(); i++){
      int a = (int)s1.charAt(i);
      
      if(a>=97 && a<=122){
        if(j%2!=0){
          a-=32;
          s2=s2+(char)a;
        }else{
          s2=s2+(char)a;
        }
        j++;
      }else{
        s2=s2+(char)a;
      }
    }
    System.out.println(s2);
  }
}
      