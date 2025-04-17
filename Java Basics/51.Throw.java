//We can Also Create our Own Exceptions By Creating Class
class MyException extends Exception
{               //it should also accept msg
    public MyException (String str)
    {
        super (str); 
    }
}
public class Throw 
{  
    public static void main(String[] args) 
    {
        int i=0; //denominator is greater than numerator 
        int j=0;

        try 
        {
            j=20/i;
            if (j==0)  //Quotient is "0" 
            { //if we want to call the catch block
            //throw tries to throw Catched by Catch block
                throw new MyException("The Denominator Is Big Than Numerator"); //create the object of catch block
            }
        } 
        catch (MyException e) //Handling Exception....
        {
            j=20/1;
            System.out.println("J Can't Divide by I" + "  " + e);
        }
        catch (Exception e) 
        {
            System.out.println("Something is Wrong..");
        }
        System.out.println(j);
        System.out.println("END");
    }
    
}
