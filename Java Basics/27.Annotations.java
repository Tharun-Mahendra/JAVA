//Annotations are used to find whether we are doing any mistake or not during writing
//before compile time or rum time
//as we got unexpected output beyond what we expect......
//we use annotations by "@"
class A
{
    public void showMethod()
    {
        System.out.println("Class A");
    }
}
class B extends A
{   //we are trying to do methodoverride.......

    @Override //annotation tries to matcch the methods and find the errors
    public void showmethod() //error -> method name missmatches......
    {
        System.out.println("Class B");
    }
}
public class Annotations 
{
    public static void main(String[] args) 
    {
        B oby=new B();
        oby.showMethod();
   }
}
