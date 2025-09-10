//Task 1
public class Lab1_Task1
{
  public static void main(String []args)
  {
    int min = 3456789;
    
    int year = min/(60*24*365);
    
    int r = min%(60*24*365);
    
    int day = r/(60*24);
    
    
    System.out.println("3456789 minutes is approximately " + year + " years and " + day + " days");
  }
}