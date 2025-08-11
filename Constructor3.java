import java.util.*;
public class Constructor3{
int ID;
String Name;
public Constructor3(int id,String name){
ID=id;
Name=name;
System.out.println("Employee information");
System.out.println("Employee id: "+ID);
System.out.println("Employee name: "+Name);
}
public Constructor3(Constructor3 obj){
ID=obj.ID;
Name=obj.Name;
System.out.println("Employee information");
System.out.println("Employee id: "+ID);
System.out.println("Employee name: "+Name);
}




public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter Employee id");
int id=sc.nextInt();
System.out.println("enter Employee name");
String name=sc.next();
Constructor3 c=new Constructor3(id,name);
Constructor3 c1=new Constructor3(c);


}
}



