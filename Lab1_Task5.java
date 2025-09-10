//Task5
public class Lab1_Task5
{
  public static void main(String []args)
  {
    double a = 4.9;
    double b = 9.5;
    double c = Math.sqrt(a*a + b*b);
    
    double sinA = a/c;
    double sinB = b/c;
    double cosA = b/c;
    double cosB = a/c;
    
    System.out.println("sinA = " + sinA);
    System.out.println("sinB = " + sinB);
    System.out.println("cosA = " + cosA);
    System.out.println("cosB = " + cosB);
  }
}