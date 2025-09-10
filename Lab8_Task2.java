//task 2
import java.util.Scanner;
public class Lab8_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        showDots(num1);
        System.out.println();
        //B
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        show_palindrome(num2);
        System.out.println();
        //C
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        showDiamond(num3);
        System.out.println();
    }
    public static void showDots(int n){
        for(int i=1; i<=n; i++){
            System.out.print(".");
        }
    }
    public static void show_palindrome(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i);
        }
        for(int i=n-1; i>=1; i--){
            System.out.print(i);
        }
    }
    public static void showDiamond(int n){
        for(int i=1; i<=n; i++){
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
    }
}