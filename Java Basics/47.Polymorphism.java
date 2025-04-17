        //POLYMORPHISM
        //Poly means "Many"   //Morphism means "Behaviour"  
        //Types  1.Compile time->Behaviour defined at compile time     2.Run time-> at run time
        //     method overloading                                    method overriding

//DYNAMIC METHOD DISPATCH
class A
{
    public void show()
    {
        System.out.println("IN A Show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("IN B Show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("IN C Show");
    }
}
public class Polymorphism 
{
    public static void main(String[] args) 
    {
        A obj=new B();  //we can create Method B child with parent class A datatype only in inheritance
        obj.show();
        
        obj=new A();  //Different objects have differnt behaviour
        obj.show();   //RUN TIME POLYMORPHISM  
                      // obj.show() behaving differently with different objects  i.e POLYMORPHISM
        obj=new C();  // we dont'know which method is called by obj.show() during compile time 
        obj.show();   // it's decided at run time so it's called RUN TIME.....
    }
    
}
