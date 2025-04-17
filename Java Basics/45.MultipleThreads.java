//Thread is a concept to run the tasks paralley..i.e running no.of.tasks at same time
//it can be done by extending a class to thread........ 
class A extends Thread 
{  //in threads we use run method... 
    public void run()
    {
        for (int i=0;i<=5;i++)
        { 
            //the o/p print depends on SCHEDULAR which gives priority to tasks...
            System.out.println("HI");//once we print the statement within 1ms ->it prints no.of times 
            //to handle that after every print we try to sleep the system for delay 
            try {Thread.sleep(5);} 
            catch (Exception e) {}
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("HELLO");
            try {Thread.sleep(5);} 
            catch (Exception e) {}
        }
    }
}
public class MultipleThreads 
{
    public static void main(String[] args) 
    {
        A obj1=new A();
        B obj2=new B();

        obj1.start();
        obj2.start();
    }
}


//if we want to iherit classes we can't do multiple inheritancess..
//so we instead implemets method runnable which extends threads class...
    class C implements Runnable
    {
        public void run()
        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("NAMSTE");
                try { Thread.sleep(5);} 
                catch (Exception e) {}
            }
        }
    } 
    class D implements Runnable 
    {
        public void run()
        {
            for (int i=0;i<=5;i++)
            { 
                System.out.println("ADAB");
                try { Thread.sleep(5);} 
                catch (Exception e) {}
            }
        }
    }
    // public class MultipleThreads
    // {
    //     public static void main(String args[]) 
    //     {
    //         Runnable obj3=new C();
    //         Runnable obj4=new D();
    // //Runnable() does not thread methods.So we have to create thread objects
    //         Thread T1=new Thread(obj3);
    //         Thread T2=new Thread(obj4);

    //         T1.start();
    //         T2.start();

    //     }
    // }