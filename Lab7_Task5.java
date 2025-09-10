//task5
public class Lab7_Task5{
  public static void main(String[]args){
    int [] marks = {100, 47, 85, 94, 5, 50};
    String [] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};

    for(int i=0;i<marks.length-1; i++){
      for(int j=0;j<marks.length-i-1; j++){
        if(marks[j]>marks[j+1]){
          int temp1 = marks[j];
          marks[j] = marks[j+1];
          marks[j+1] = temp1;
         
          String temp2 = names[j];
          names[j] = names[j+1];
          names[j+1] = temp2;
        }
      }
    }
    for(int i=0;i<marks.length; i++){
      System.out.print(marks[i]+" ");
    }
    System.out.println();
    for(int i=0;i<names.length; i++){
      System.out.print(names[i]+" ");
    }
  }
}