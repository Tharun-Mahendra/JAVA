class A
{
    public int age; //variable

    public void show()
    {
        System.out.println("class A Show");
    }

    class B //inner class 
    {
        public void config()
        {
            System.out.println("Inner class B");
        }
    }
}
public class InnerClass 
{
    public static void main(String[] args) 
    {
        A main=new A();
        main.show();

        //to call class B inner class
        A.B obj=main.new B(); //object should be declared with the Class A object here it's main 
        //A.B indicats B class Belongs to A
        obj.config();
    }
    
}
