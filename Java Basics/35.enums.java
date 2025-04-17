//enumeration (enum)
//enum are named constants
enum Laptop //class
{  
    ASUS,DELL,LENOVO,MACBOOK,HP //constants (objects of class Laptop)
}
public class enums 
{
    public static void main(String[] args) 
    {
        Laptop Lap=Laptop.ASUS; //to print single constant
        System.out.println(Lap);

    //     Laptop[] Lap=Laptop.values(); //.values()to print all Constants
    //     for( Laptop n:Lap)
    //    {
    //     System.out.println(n);
    //    }
    }
   
}
