class computer //creating class
{
    //method 1
    public void playMusic() //if we use void we are not expecting the return 
    {
        System.out.println("playing music");  //behaviour
    }
    //method 2
    public String getMeAPen(int cost)  //string we are expecting the return
    
    {  //behaviour
        if (cost >=10)
            return "PEN";
        // no need of else as method exits if it returns once
            return "Not Enough Money";
    }
    //main method
}
public class method 
{
    public static void main(String a[])
    {
        computer obj = new computer(); //creating object
        obj.playMusic(); //calling method 1
         String str = obj.getMeAPen(22);//method 2

         System.out.println(str);
    }
    
}
