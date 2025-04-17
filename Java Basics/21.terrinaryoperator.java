public class terrinaryoperator
{
    public static void main(String[] args) 
    {
        int x=2;
        int result=0;

       // if (x%2==0) // "%" gives reminder is equal to "0" it's even as div by "2"
       //    result=10; //even
       // else
       //     result=20; //odd

       //?: ->TERRINARY OPERATOR 
       //prints the value after "?" if condition is true else prints after ":"

       result = x%2==0 ?10 :20; //it performs the above operation within single line

        System.out.println(result);
        
    }
    
}

// public class trial 
// {
//        public static void main(String[] args) 
//     {
//         int x=88;
//         int y=39;
//         int result=0;  

//         result=x>y ?x :y; //for finding largest number

//         System.out.println(result);
        
//     }   
// }
