class mobile
{
    static String name; //converted to static now its accesed by class not with objects
    int price;
    String brand;

    public void show() //show() is used to show all the values
    {
        System.out.println(brand+":"+price+":"+name);
    }
}
                                      //static is used to print the same name for different objects for many times
public class demostatic               //here smartphone is used 
{                                     //for saving memory
    public static void main(String[] args)
    {
        mobile obj1=new mobile();
        obj1.brand="Apple";
        obj1.price=75000;
        mobile.name="smartphone"; //called by class name static variable

        mobile obj2=new mobile();
        obj2.brand="Realme";
        obj2.price=22000;
        mobile.name="smartphone"; //class name


        mobile.name="changed";//if we change once it effects all

        obj1.show();
        obj2.show();
    
        
            
    }
}