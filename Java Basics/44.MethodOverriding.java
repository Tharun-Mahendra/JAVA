class Calc
{
    public int add(int n1,int n2)   //Method Overriding method name and its parameters are same
    {
        return n1+n2 ;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)  //add method is OverRided with the parent class add method
    {
        return n1+n2+100;   //it prints +100 adding with the result as the parent method OverRided
    }
}
public class MethodOverriding 
{
    public static void main(String[] args)
    {
        AdvCalc obj=new AdvCalc(); //the child class object should be created as we overided in child class
        int add=obj.add(15, 05);

        System.out.println(add);     
    }
    
}
