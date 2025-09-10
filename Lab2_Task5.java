//Task 5
import java.util.Scanner;
public class Lab2_Task5 
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter the amount to be paid");
    int cost = sc.nextInt();
    
    System.out.println("Please enter the amount the customer has given");
    int paid = sc.nextInt();
    
    if(cost == paid){
      System.out.println("The returned amount is 0 taka.");
    }
    else if(cost > paid){
      int more = cost - paid;
      
      System.out.println("Please pay " + more + " taka more.");
    }
    else if(cost < paid){
      int ret = 0;
      ret = paid - cost;
      
      int note100 = 0;
      int note50 = 0;
      int note20 = 0;
      int note10 = 0;
      int coin5 = 0;
      int coin2 = 0;
      int coin1 = 0;
      
        
      System.out.println("The returned amount is " + ret +" taka");
      
      //for 100
      note100 = ret/100;
      ret = ret%100;
      System.out.println("100 taka note: " + note100);
      
      //for 50
      note50 = ret/50;
      ret = ret%50;
      System.out.println("50 taka note: " + note50);
      
      //for 20
      note20 = ret/20;
      ret = ret%20;
      System.out.println("20 taka note: " + note20);
      
      //for 10
      note10 = ret/10;
      ret = ret%10;
      System.out.println("10 taka note: " + note10);
      
      //for 5
      coin5 = ret/5;
      ret = ret%5;
      System.out.println("5 taka coin: " + coin5);
      
      //for 2
      coin2 = ret/2;
      ret = ret%2;
      System.out.println("2 taka coin: " + coin2);
      
      //for 1
      coin1 = ret/1;
      System.out.println("1 taka coin: " + coin1);
    }
    sc.close();
  }
}