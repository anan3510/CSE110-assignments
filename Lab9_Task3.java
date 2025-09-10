//task3
public class lab9_task3{
    public static void main(String[] args){
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_element(arr, index);
    }
    public static void print_element(int [] a, int b){
        if(b<a.length){
            System.out.println(a[b]);
            print_element(a, b+1);
        }
    }
}