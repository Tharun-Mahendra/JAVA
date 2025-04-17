import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI 
{
    public static void main(String[] args) 
    {
        List<Integer> numList=Arrays.asList(5,9,6,7,3,2,4);

        // Stream<Integer> S1=numList.stream(); //All the values in List are available in S1
            // we can perform operations on Stream S1
            // it does not effect numList
            // once stream used can't be reused again

            // to filter even numbers
        // Stream<Integer> S2=S1.filter(n ->n%2==0);   //LambdaEXpressionsss  
            // to double them
        // Stream<Integer> S3=S2.map(n->n*2);
            // to add them together
        // int result=S3.reduce(0,(a,b)->a+b);

        // we can reduce this code
        int result=numList.stream()
                          .filter(n->n%2==0)
                          .map(n->n*2)
                          .reduce(0, (a,b)->a+b);
     
       System.out.println(result);   
    }
}
