
class calculator  //creating class
{
    //int a;  //creating a variable 
    
    //method
    public int add(int n1,int n2)
    {
        int r= n1+n2;
        return r;
    }
}

public class creatingobject 
{
    public static void main(String[] args) 
    {
    int num1=5;
    int num2=9;
    //creating object
    calculator calc=new calculator(); //we create object by specifying "new"
    int result=calc.add(num1, num2);
    
    System.out.println(result);
    }
}