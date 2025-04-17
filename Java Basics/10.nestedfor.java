public class nestedfor 
{
    public static void main(String a[])
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Day "+i);

            for(int j=1;j<=8;j++)
            {
                System.out.println("       "+(j+8)+"-"+(j+9)); //we are printing time from 9am-5pm in a day
            }
        }
    }
    
}
