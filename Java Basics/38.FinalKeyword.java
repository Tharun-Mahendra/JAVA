    //Final->used with Variable, Method, Class  

//Final Variable-------------
// public class FinalKeyword 
// {
//     public static void main(String[] args) 
//     {
//         final int a=10; //once we assign final to a variable it becomes constant
//        // a=1874563;
//         System.out.println(a);   
//     }
// }

//Final Class------------
final class Calc //makes the class Calc cannot inherit by another classes
{
    //Final Method-------------
    public final void Show() //stops overriding the method
    {
        System.out.println("in Calc Show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class FinalKeyword 
{
    public static void main(String[] args)
    {
        Calc obj=new Calc();
        obj.Show();
        obj.add(5, 05);   
    }      
}