//task 1
import java.util.Scanner;
public class Lab8_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        boolean check = isPrime(num1);
        System.out.println(check);
        //B
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        check = isPerfect(num2);
        System.out.println(check);
        //C
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        int result = special_sum(num3);
        System.out.println(result);

    }
    public static boolean isPrime(int n){
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
    return true;
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1; i<=n-1; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }
    public static int special_sum(int n){
        int result = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i) || isPerfect(i)){
                result+=i;
            }
        }
        return result;
    }
}