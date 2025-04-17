import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionInterface
{
    public static void main(String[] args) 
    {
        //using inbuilt classes
        //to specify type in Collection we specify that between Generics"<>"... 
        Collection<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        //we can directly print the array without any loops..
            // System.out.println(numbers);
        //to print separately
        for (int n : numbers)
        {
            // System.out.println(n);
        }

        //To print the index valus it is not possible in Collection as there is no get() method
        //instead we can use List Interface......
        List<Integer> nums=new ArrayList<>();
        nums.add(101);
        nums.add(102);
        // System.out.println(nums.get(0));

        //In Collection/List it is possible to print repeated values. Too avoid this we can use Set.........
        Set<Integer> NUM1 =new HashSet<>();
        NUM1.add(10);
        NUM1.add(58);
        NUM1.add(46);
        NUM1.add(10);
        NUM1.add(29);

        for (int m:NUM1)
        {
            System.out.println(m);
            // It prints the values In random order
            // It also Dont have get method to specify index values 
        }    
    }   
}
