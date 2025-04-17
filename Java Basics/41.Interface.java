interface A //interface is not an class. 
//we use this whenever every method in an class should be public and abstract
{
    void show();    //no need to mention public and abstract for the methods
    void config();  //they are written predefinely for interface

//to declare variables in interface they are defaultly FINAL and STATIC 
//once declared can't be changed
//static variables are called by their interface/class name not with method names........  

    int age=10;
    String name="interface";
}
interface X 
{} 

//inheritance keywords
//class-class->extends
//interface-class->implements
//interface-interface->extends

class B implements A,X //inheriting the properties by "implements" keyword for interface
{   //A single class can impelement multiple interfaces........
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
        B obj=new B();
        obj.show();
        obj.config();

//to print variables as they are static defaultly in interface..........
        System.out.println(A.age);
        System.out.println(A.name);
    }
}
