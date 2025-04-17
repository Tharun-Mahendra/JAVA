class human
{
    private int age;
    private String name;

    public human()   //default constructor ->no need of data type and created with the same "class name" is rule
    {   //whenever there is an object it automatically calls the constructor 
        // "n" no.of objects "n" no times constructor is called
        age=18;
        name="tharun";
    }
    public human(int a,String n)    //parametrized constructor
    {
        age =a;
        name=n;
    }
    public int getAge()
    {
        return age;
    }                               //if no constructor is created java itself creates default constructor 
    public void setAge(int a)       //whenever we creates objects
    {
        age=a;
    }
    public String getname()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class constructor 
{
    public static void main(String[] args) 
    {
        human obj=new human();  //default constructor values printedd
        human obj1=new human(22 ,"ganesh"); //parameterized constructor values assigned here
        
        System.out.println(obj.getname()+":"+obj.getAge() );
        System.out.println(obj1.getname()+":"+obj1.getAge() );


        // obj1.setAge(12);
        // obj1.setName("tharun");     
    }
    
}
