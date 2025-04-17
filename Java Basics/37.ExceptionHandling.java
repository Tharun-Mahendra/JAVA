
public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        // int i=0;  //normal statement
        // int j=2/i;  //critical statement as it has to divide the number by "i" it depends on "i" value
        // System.out.println(j);
        // System.out.println("the end..");
        //OUTPUT
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at ExceptionHandling.main(ExceptionHandling.java:9)
        //we can see the exception occures and stop the execution in middle........
        //we have to handle them

        //we have to maintain the critical statements in block
        int i=0;
        int j=0;
        try        // enters the block and tries to execute condition if its true it continues
        {
            j=20/i;   //else throws the exception catched by the catch block
        } 
        catch (Exception e)  //handles the exception and continues execution without stopping in middle
        {
            System.out.println("Something Went Wrong..."  );
        }
        System.out.println(j);
        System.out.println("The end");
    }
    
}
