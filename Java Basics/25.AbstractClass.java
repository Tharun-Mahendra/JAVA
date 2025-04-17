abstract class Car // to use abstract method class should be abstract class
{
    public abstract void  Drive(); // to declare the method within it we have to use abstract keyword

    //whenver we create an method and not implementing anything in it then we can declare that with abstract

    
    public void playMusic()  //we can create normal methods in abstract class
    {
        System.out.println("Playing Music....");
    }
}
//We cant create object for abstract classes
class Vehicle extends Car // if we inherit parent abstract class we must compulsory create method for it
{
    public void Drive()
    {
        System.out.println("Driving the Vehicle....");
    }
}
public class AbstractClass 
{
    public static void main(String[] args) 
    {
        Car obj=new Vehicle();
        obj.Drive();
        obj.playMusic();            
    }
    
}
