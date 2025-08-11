import java.util.*;
public class Thiskeyword{
int roll;
String name;
int salary;
public Thiskeyword(int roll,String name,int salary){
this.roll=roll;
this.name=name;
this.salary=salary;
}
public void display(){
System.out.println("Information:");
System.out.println("Roll no:"+roll);
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
}
public static void main(String args[]){
Thiskeyword obj=new Thiskeyword(113,"Purva",100000);
obj.display();
}
}
