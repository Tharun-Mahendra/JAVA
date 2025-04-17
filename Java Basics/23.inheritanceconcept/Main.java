package inheritanceconcept;

public class Main 
{
    public static void main(String[] args) 
    {
        VeryAdv obj=new VeryAdv();  //always the last inherited file object should br created to access all methods
        int add=obj.add(12, 9);
        int sub=obj.sub(47, 7);
        int multiply=obj.multiply(5,10);
        int division=obj.division(10, 2);
        double power=obj.power(4, 2);

        System.out.println(add+"  "+sub+"  "+multiply+"  "+division+"  "+power);
        
    }
    
}
