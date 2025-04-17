public class nestedwhile 
{
    public static void main(String[] args) 
    {
        int i=1;
        while(i<=5)
        {
            System.out.println("hi"+i); // condition is true print the o/p
            
            int j=1;  
            while(j<=2)
                { //enters the block checks condition and prints the o/p 2 times as it exit the block the "j" 
                    System.out.println("hello"+j);        //value again becomes 1
                    j++;
                }
            
            i++;
        }
        System.out.println("the end"+i);

    }
    
}
