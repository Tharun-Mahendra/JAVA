public class conditionalstatements
{
    public static void main(String[] args) 
    
    {
        int x=29;
        int y=22;
        int z=5;

        //if (x>y)
        //    System.out.println(x);   ->if there are 2 values to compare we use this
        //else
        //    System.out.println(y);
        
        if(x>y && x>z) //checks "x" is greater 
            System.out.println(x);
        else if(y>z)   //as "x" is smaller and the codition failed we dont need to check it again we only compare "y" with "z"        
            System.out.println(y);
        else 
            System.out.println(z);
        
    }
    
}
