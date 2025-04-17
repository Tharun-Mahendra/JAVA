class A 
{
    public void method() throws ClassNotFoundException //we handle Exception when we call this method
    {
        Class.forName("UNAVALIABLECLASS"); 
    }
}       //DuckingException means we are handling the exception where we are calling the method  by "throws" keyword
public class DuckingException 
{
    public static void main(String[] args) 
    {
       A obj=new A();
       //Exception is handled Here as we are calling Method()
       try 
       {
        obj.method();
       }
       catch (ClassNotFoundException e) {} 
    }
    
}
