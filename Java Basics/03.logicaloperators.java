public class logicaloperators 
{
    public static void main(String[] args)
    {
        int a=2;
        int b=4;

        int x=10;
        int y=12;

        //boolean result= a<b & x<y; ->AND OPERATOR if both of them true prints true
        //boolean result= a>b | x>y; ->OR OPERATOR if any one is true it prints true
        //boolean result= a<b && x<y;->"&&" is used to get faster output it is a shortcut where if first condition
                                             // is false it dont check the second one as if any one is false the o/p
                                             // is false for AND gate
        // boolean result= a<b || x<y;->"||" is same as above if first is true it gives o/p as true it wont checks  
                                             // the next condition to give faster o/p

        boolean result= a<b & x<y;
        System.out.println(!result); //"!"NOT OPERATOR reverse the o/p
    }
}
