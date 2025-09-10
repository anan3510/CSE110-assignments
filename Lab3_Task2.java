//task2
public class Lab3_Task1{
  public static void main(String []args){
   
    int sum = 0;
    for(int a=0 ; a<=600 ; a++){
      if(a%7==0 && a%9!=0){
        sum=sum+a;}
      if(a%9==0 && a%7!=0){
        sum=sum+a;}
    }
    System.out.println(sum);
  }
}