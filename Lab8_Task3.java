//task 3
import java.util.Scanner;
public class Lab8_Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter income: ");
        int inc = sc.nextInt();
        //A
        double t = calcTax(age, inc);
        System.out.println(t);
        //B
        calcYearlyTax();
    }
    public static double calcTax(int age, int inc){
        if(age<18 || inc<10000){
            return 0;
        }else if(inc>=10000 && inc<=20000){
            return (inc/100)*7;
        }else if(inc>20000){
            return (inc/100)*14;
        }return 0;
    }
    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        double yt = 0;
        for(int i=1; i<=12; i++){
            System.out.print("Enter income for month " + i + ": ");
            int inc = sc.nextInt();
            double t = calcTax(age, inc);
            System.out.println("Tax for month " + i + ": " + t);
            yt += t;
        }
        System.out.println("Yearly tax: " + yt);
    }
}