class students
{
    int marks;
    int rollno;
    String name;
}
public class stringarray 
{
    public static void main(String[] args) 
    {
        // we have to create objects
        students s1=new students();
        s1.name="tharun";
        s1.rollno=1;
        s1.marks=76;

        students s2=new students();
        s2.name="arun";
        s2.rollno=2;
        s2.marks=83;

        students s3=new students();
        s3.name="gani";
        s3.rollno=3;
        s3.marks=90;

        // objects has to assigned to a array

        students ABC[] =new students[3];
        ABC[0]=s1;
        ABC[1]=s2;
        ABC[2]=s3;

        //normal for loop
        // for(int i=0;i<ABC.length;i++)
        // {
        //     System.out.print("name:"+ABC[i].name +"  marks:"+ABC[i].marks +"  rollno:"+ ABC[i].rollno );
        //     System.out.println();
        // }

        //enhanced for loop
        for (students n:ABC)
        {
           System.out.println("name:"+n.name +"  marks:"+n.marks +"  rollno:"+ n.rollno );
   
        }
       
    }
    
}