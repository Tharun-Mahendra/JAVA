public class TypesOfException 
{
    public static void main(String[] args) 
    {
        int i=2;
        int j=0;

        int nums[]=new int[5];
        //there are many types of exceptions like this..... 
        //we use diiferent catch blocks for different exceptions just to know what the error to the user by printing the statement...
        //they all can be handle defaultly by Exception catch block also.. 
        try 
        {
        //Arthimetic Exception
            j=20/i;  
        //ArrayOutOfBonds Exception
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) //to catch Arthimetic Exception and print the statement
        {
            System.out.println("Cannot Divide The Number By Zero..");
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Try To Be WithIn Limits...");
        }
        catch (Exception e) //parent class used in default case to handle all exceptions.-> should be always last
        {
            System.out.println("Something Went Wrong...");
        }
        System.out.println(j);
        System.out.println("The End..");
    }
    
}
