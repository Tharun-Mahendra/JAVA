//LambdaExpressions are only possible in Functional Interface where we have single method in an interface

@FunctionalInterface
interface A
{
    // void show();
    int add(int i,int j); 
}
public class LambdaExpression 
{
    public static void main(String[] args) 
    {
        //we are calling using Anonymous Inner Class
        //LamdaExpressions are used to reduce the code "->" by indicating arrow mark
        //normal code
            // A obj =new A() 
            // {
            //     public void show()
            //     {
            //         System.out.println("Lambda Expression");
            //     }
            // };
        //LambdaExpression
            // A obj =()-> System.out.println("Lambda Expression");
        //in this after we type A obj=() it creates obj and also public vois show is written
        //"->" after this expression we have to print what we want
            // obj.show();


        //we can also use this for methods which returns value    
            // A obj=new A() 
            // {
            //     public int add(int i,int j)
            //     {
            //         return i+j;
            //     }          
            // };
            // int result= obj.add(5, 07);
            // System.out.println(result);
        //LamdaExpression
        A obj=(i,j)->i+j ;
    
        int result= obj.add(5, 07);
        System.out.println(result);
    }
    
}
