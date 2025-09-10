//task1
import java.util.Scanner;
public class lab9_task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
    public static int factorial(int a){
        if(a==1){
            return a;
        }else{
            return a*factorial(a-1);
        }
    }
}