public class switchstatement
{
    public static void main (String a [])
    {
        int n=88;

        switch (n)  
                                        //as if the n value matches with the case it prints the output 
                                        //without checking the next cases
        {                               //for ex :n=2 it prints from "tuesday to last sunday"
                                        //to avoid this we use "break;" after every case to come out of the block
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default: // we use default case if the number does not matches with anyone case
            System.out.println("enter valid number");
            
        }
        
    }
}
