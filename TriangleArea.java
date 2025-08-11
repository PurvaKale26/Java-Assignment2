import java.util.*;
class Area{
  float areaOfTriangle(float b,float h){
float result=(float)((0.5)*b*h);
 return result;
}
}
public class  TriangleArea{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
System.out.println("enter base and height of triangle");
float base,height;
base=sc.nextFloat();
height=sc.nextFloat();
Area A=new Area();
System.out.println("Area of Triangle is:" +A.areaOfTriangle(base,height));
}
}