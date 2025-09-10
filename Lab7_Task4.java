 //task4
import java.util.Scanner;
public class Lab7_Task4{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean f = false;
   
    System.out.print("Please enter the length of array 1: ");
    int size = sc.nextInt();
    int [] arr1 = new int[size];
    System.out.println("Please enter the elements of the arr1:");  
    for(int i=0;i<arr1.length; i++){
      arr1[i] = sc.nextInt();
    }
   
    System.out.print("Please enter the length of array 2: ");
    size = sc.nextInt();
    int [] arr2 = new int[size];
    System.out.println("Please enter the elements of the arr2:");
    for(int i=0;i<arr2.length; i++){
      arr2[i] = sc.nextInt();
    }
   
    for(int i=0;i<arr2.length; i++){
      f = false;
      for(int j=0;j<arr1.length; j++){
        if(arr2[i]==arr1[j]){
          f = true;
        }
      }
      if(f==false){
        System.out.println("Array 2 is not a subset of Array 1");
        break;
      }
    }
    if(f){
      System.out.println("Array 2 is a subset of Array 1");
    }
    sc.close();
  }
}