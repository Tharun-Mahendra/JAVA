abstract class A
{
   abstract public void show();
}
public class AbstractandAnonymous 
{
    public static void main(String[] args) 
    {
        A obj=new A() //we cant create object for abstract class
        {  //instead of creating another class we used AnonymousInnerClass
            public void show()
            {
                System.out.println("Anonymous Inner Class");
            }  
        };
        obj.show();      
    }
    
}
