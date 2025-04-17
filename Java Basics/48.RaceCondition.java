// A race condition in Java is a situation where two or more threads access and modify a shared resource 
// (e.g., a variable, object, or database) concurrently, leading to unexpected behavior or incorrect results            
class Counter 
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class  RaceCondition 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter c=new Counter();
        //Lambda Expressions
        Runnable obj1=() -> 
        {
            for(int i=0;i<10000;i++)
                {c.increment();}
        };
        Runnable obj2=() ->
        {
            for(int i=0;i<10000;i++)
                {c.increment();}
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        //the output is printing before both the threads are completing there tasks we need to join them
        //they will join after they complete their tasks automatically
        t1.join();
        t2.join();
        //after we are joining also both the threads are reaching the count parallely & incrementing them at once
        //by which they are Assuming as incremented but the count increments only once
        //to avoid this we have to make our method as Synchronized
        //by which our increment method will work only with one thread at a time avoiding RaceCondition
        System.out.println(c.count);
    }   
}
