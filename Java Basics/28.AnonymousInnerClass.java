class A 
{
    public void show()
    {
        System.out.println("IN A Show"); 
    }
}
//To override an "A" class O/P we have to Create new Sub class and inherit with the parent class 
//for one output instead of creating new class We use concept called AnonymousInnerClass
//where the inner class is created in main file after object is created and the method is defined within it
public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        A obj=new A() //object created and method overrided within it
        {
            public void show()  //inner class is created without any name so called anonymous inner class
            {
                System.out.println("New Anonymous Inner Class");
            }
        };      //";" is important as it is end of the object created

        obj.show();
    }
    
}
