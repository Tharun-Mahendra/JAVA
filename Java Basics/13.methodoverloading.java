class calculator
{
    public int add(int n1,int n2) //method 1
    {                                               //METHODOVERLOADING is a concept where we can use same method 
        return n1+n2 ;                              //no of times we want but the parameters should be different
    }                                                      //here add() is a method 
    public int add(int n1,int n2,int n3) //method 2        // n1,n2,n3,int,double are parameters
    {
        return n1+n2+n3 ;
    }
    public double add(double n1,int n2) //method 3
    {
        return n1+n2 ;
    }
    
}
public class methodoverloading 
{
    public static void main(String[] args) 
    {
        calculator calc=new calculator();//object
        int result=calc.add(3,5,3);
        
        System.out.println(result);
    }
}
