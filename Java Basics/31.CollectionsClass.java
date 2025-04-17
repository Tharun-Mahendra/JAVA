import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//for String Datatype
class Student
{
    int Age;
    String Name;
  //CONSTRUCTOR to create data
    public Student (int Age,String Name)
    {
        this.Age=Age;
        this.Name=Name;
    }
  //toString to print the OUTPUT
    public String toString() 
    {
        return "Age="+Age+"  Name="+Name;
    } 
}



public class CollectionsClass 
{
    public static void main(String[] args) 
    {
        List<Integer> NUMS=new ArrayList<>();
        NUMS.add(19);
        NUMS.add(18);
        NUMS.add(24);
        NUMS.add(65);
        NUMS.add(12);
    //IF we want to sort the values we have CollectionsClass......
            // Collections.sort(NUMS);
    //IF we want to sort based on our own logic. Let's Say last digit ...
    // to acheive this we have to use comparator interface 
            // Comparator<Integer> Com =new Comparator<Integer>() 
            // {  
            //     public int compare(Integer i,Integer j)
            //     { 
            //         if(i%10 >j%10)
            //             return 1; //1 to swap the sort order
            //         else
            //             return -1; //-1not to swap the order 
            //     }
            // };
    //As Comparator is an Functional Interface WE Can Form Lambda Expression
        Comparator<Integer> Com =(i,j) ->{ 
                if(i%10>j%10)return 1; 
                return -1;
        };
        Collections.sort(NUMS,Com); //we have to pass our logic
        System.out.println(NUMS);
        
  //For String DataType...
        List<Student> Studs=new ArrayList<>();
        Studs.add(new Student(21, "Tharun"));
        Studs.add(new Student(20, "Varun"));
        Studs.add(new Student(17, "Ganesh"));
        Studs.add(new Student(25, "Naveen"));
        Studs.add(new Student(16, "Kumar"));

        //to sort
        Comparator<Student> com1 =(i,j) ->{ 
            if(i.Age>j.Age)return 1; 
            return -1;
        };

        Collections.sort(Studs,com1);
        for (Student n:Studs)
        System.out.println(n);
    }
}
