import java.io.BufferedReader; //package has imported automatically  
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) throws IOException
            // {
            // //Accepting the Input from The User....
                // Using BufferedReader Class....
            //     System.out.println("Enter Your Number ....");

            //     InputStreamReader Input=new InputStreamReader(System.in);
            //         // InputStreamReader needs object System.in as we are getting input from user
            //     BufferedReader Bf=new BufferedReader(Input); //we have to create object of class BufferedReader
            //         //it accepts files or user inputs 
            //         // to accept user inputs we have to create object for InputStreamReader
            //     int num =Integer.parseInt(Bf.readLine()); //it Gives IO Exception we have to handle it
            //         // Bf.readLine() give u string we have to convert to integer

            //     System.out.println(num);
            //     Bf.close();//we have to close the file
            // }

    {
        //Using Scanner Class
        System.out.println("Enter Your Number....");

        Scanner Scan=new Scanner(System.in); //create object 

        int num=Scan.nextInt(); //Scanner has types of input values we dont have to convert into integer
        System.out.println(num);
        Scan.close();
            
    }
    
}
