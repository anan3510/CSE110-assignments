
//task 1
import java.util.Scanner;

public class Lab7_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(arr);
        sc.close();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                arr[i] = 0;
            } else if (arr[i]>0) {
                arr[i] = 1;
            }
        }
        System.out.println();
        System.out.println("Modified array: ");

        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}