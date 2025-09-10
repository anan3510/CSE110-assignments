//task 5
import java.util.Scanner;
public class Lab6_Task5{
  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    boolean t = false;
    
    for(int i=0; i<=s2.length()-s1.length(); i++) {
      int j=0;
      while(j<s1.length() && s2.charAt(i+j)==s1.charAt(j)){
        j++;
      }
      if(j==s1.length()){
        t=true;
        break;
      }
    }
    if(t){
      System.out.println("Invalid");
    }else{
      System.out.println("Valid");
    }
  }
}