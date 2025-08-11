import java.util.*;
class Area{
  float areaOfCircle(float r){
float result=(float)((Math.PI)*r*r);
 return result;
}
}
public class CircleArea{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
System.out.println("enter radius of circle");
float radius;
radius=sc.nextFloat();

Area A=new Area();
System.out.println("Area of Circle is:" +A.areaOfCircle(radius));
}
}