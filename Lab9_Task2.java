//task2
import java.util.Scanner;
public class lab9_task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");-
        int b = sc.nextInt();
        int x = power(a,b);
        System.out.println(x);
    }
    public static int power(int a, int b){
        if(b==1){
            return a;
        }else{
            return a*power(a, b-1);
        }
    }
}