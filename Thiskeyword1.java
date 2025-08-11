public class Thiskeyword1{
int a,b;
public Thiskeyword1(){
this(10,90);
System.out.println("USing no argument constructor");
}
public Thiskeyword1(int a,int b){
int c=a+b;
System.out.println("USing Paramiterized constructor");
System.out.println("Addition:"+c);
}
public static void main(String args[]){
Thiskeyword1 obj=new Thiskeyword1();
}
}

