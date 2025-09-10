//Task 4
public class Lab1_Task4
{
  public static void main(String []args)
  {
    int a = 8;
    int b = 3;
    double side = Math.sqrt( ( (a/2) * (a/2) ) + (b*b) );
    
    double area = (( (3 * Math.sqrt(3)) /2) * (side * side));
    double crm = side * 6;
    
    System.out.println("the area of the hexagon is " + area + " and the circumference is " + crm );

    
  }
}
