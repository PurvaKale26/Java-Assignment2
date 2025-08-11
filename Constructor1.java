public class Constructor1{
String name;
int id;
public  Constructor1(){
name="Purva";
id=113;
}

public void display(){
 System.out.println("Employee information");
 System.out.println("Employee name: "+name);
 System.out.println("Employee id: "+id);
}

public static void main(String args[]){
 Constructor1 c=new Constructor1();
 c.display();

}
}


 
