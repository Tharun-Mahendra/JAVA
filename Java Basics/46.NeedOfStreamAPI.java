import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


// StreamAPI
// It’s designed to make your code more concise, readable, and efficient.
public class NeedOfStreamAPI
{
    public static void main(String[] args)
    {
    // Arrays.asList to give numbers at a time..
        List<Integer> numList =Arrays.asList(5,9,6,7,3,2,4);
    //to filter even numbers from this list and double them and sum them together and print result
        int sum=0;
        for (int n:numList)
        {
            if(n%2==0)
            {
                n=n*2;
                sum =sum+n;
            }
        }
        System.out.println(sum);
    //The Above Calculation can be done in StreamAPI very easily..........
    //to print all values we can also use another Method call "forEach"
        Consumer<Integer> con =new Consumer<Integer>() 
        {
            public void accept(Integer n)
            {
                // System.out.println(n);
            }    
        };
        numList.forEach(con);
    // Lambda Expression
        // numList.forEach(n->System.out.println(n));
    }
    
}
