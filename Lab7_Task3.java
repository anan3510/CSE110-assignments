//task3
import java.util.Scanner;
public class Lab7_Task3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter size of array");
    int size = sc.nextInt();
    double [] arr = new double[size];
   
    for(int i=0;i<arr.length; i++){
      System.out.print("Enter a number");
      arr[i] = sc.nextDouble();
    }
    int max_in = 0,min_in = 0;
    double max = arr[0],min = arr[0];
    double sum = arr[0],avg = 0;
   
    for(int i=1;i<arr.length; i++){
      if(max<arr[i]){
        max = arr[i];
        max_in = i;
      }
      if(min>arr[i]){
          min = arr[i];
          min_in = i;
        }
      sum+=arr[i];
    }
    avg = sum/arr.length;
   
    System.out.println("Maximum element "+max+" found at index "+max_in);
    System.out.println("Minimum  element "+min+" found at index "+min_in);
    System.out.println("Summation: "+sum);
    System.out.println("Average: "+(String.format("%.2f", avg)));
    sc.close();
  }
}