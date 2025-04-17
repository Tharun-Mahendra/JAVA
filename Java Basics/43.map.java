import java.util.HashMap;
import java.util.Map;

// Map is a Collection that stores key-value pairs, where each key is unique and maps to a specific value
// it is an interface
public class map 
{
    public static void main(String[] args) 
    {
        Map<String ,Integer> Students=new HashMap<>();
        Students.put("Tharun",78); 
        Students.put("Ramu",57);
        Students.put("Harsha",68);
        Students.put("Raj",68);
        Students.put("Tharun",54);
        // the Key Cannot be Repeated

        System.out.println(Students);
        //to print separately
        for (String n:Students.keySet())//KeySet()gives all Key's..
        {
            System.out.println(n + ":" +Students.get(n));//get() to get values 
        }
    }
    
}
