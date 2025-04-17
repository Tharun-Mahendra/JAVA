class human
{
    private int age;    //these age and name are encapsulated with private keyword where we can't access
    private String name;    //them from another class directly 
    //to access them->
    public int getAge() //we can use any method instead of getage
    {
        return age;   //returns age
    }
    public void setAge(int a)   //setting age to variable a
    {
        age=a; 
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)  //setting name to variable n
    {
        name=n;
    }
}
//Accesing from another class 
public class encapsulation 
{
    public static void main(String[] args) 
    {
        human obj=new human();  //creating object
        obj.setAge(21); //setting the age
        obj.setName("Tharun");  //setting the name

        System.out.println(obj.getName()+":"+obj.getAge());
    }                      // accesed by object name
    
}
