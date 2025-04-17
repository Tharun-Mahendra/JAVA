class A
{
    public A() //default constructor
    {
        super(); //if we write or not whenever we create constructor it will be created automatically by java
        System.out.println("Class A Default Constructor");
    }
    public A(int n)
    {
        super();
        System.out.println("parameterized Constructor Of Class A");
    }
}
class B extends A //sub class of A
{
    public B()
    {
        super();    //this executes super class i.e class A default
        System.out.println("Class B Default Constructor");
    }
    public B(int n)
    {
        this(); //"this()"executes constructor of same class i.e class B default
        System.out.println("Parameterized Constructor Of Class B");
    }

}
public class  ThisandSupermethod 
{
    public static void main(String[] args) 
    {  
        B obj=new B(5);  // it calls paremetrized of class B
        
    }
    
}
