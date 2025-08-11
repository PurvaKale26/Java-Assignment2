import java.util.*;
public class Constructor2{
int ID;
String Name;
public Constructor2(int id,String name){
ID=id;
Name=name;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter Employee id");
int id=sc.nextInt();
System.out.println("enter Employee name");
String name=sc.next();
Constructor2 c=new Constructor2(id,name);
System.out.println("Employee information");
System.out.println("Employee id: "+c.ID);
System.out.println("Employee name: "+c.Name);

}
}



