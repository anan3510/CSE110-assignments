//task2
import java.util.Scanner;
public class Lab7_Task2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter size of array");
    int size = sc.nextInt();
    int [] arr = new int[size];
   
    for(int i=0;i<arr.length; i++){
      System.out.print("Enter a number");
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter a number to search: ");
    int a = sc.nextInt();
    for(int i=0;i<arr.length; i++){
      if(arr[i]==a){
        System.out.print(a+" is at index "+i);
        break;
      }
    }
    sc.close();
  }
}