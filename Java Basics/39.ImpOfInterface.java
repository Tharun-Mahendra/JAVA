interface Computer
{                      //interface by default public abstract
    void code();//we are using interface as we are declaring the method itself 
}
class Desktop implements Computer
{
    public void code()  //desktop to write code faster implementss....
    {
        System.out.println("Code:Compile:RunFaster");
    }
}
class Laptop implements Computer
{
    public void code()  //laptop to write code
    {
        System.out.println("Code:Compile:Run");
    }
}
class Employee
{   //employee who devloping code needs computer com
    public void DevlopingCode(Computer com)
    {
        com.code(); //computer com is used to wrie code
    }
}
public class ImpOfInterface 
{
    public static void main(String[] args) 
    {
        Computer Laptop=new Laptop();
        Computer Desktop=new Desktop();
        
        Employee Tharun=new Employee();
        Tharun.DevlopingCode(Laptop); //devlpoing code using .Desktop/Laptop
            
    
        
    }
    
}
