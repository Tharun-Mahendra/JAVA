public class multidimarray 
{
    public static void main (String args[])
    {
        int nums[][]=new int[3][4]; //rows*columns 3*4
            //"[][]" indicates multidimensional array
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)    //"MATH" is an inbuilt library
            {                    //random gives double value from 0.0->1.0 we multiply"*10"
                nums[i][j]=(int)(Math.random()*10); //type casting double to int"(int)(Math.random)" 
            }                    //every time it prints random value
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
                {                                
                    System.out.print(nums[i][j] +" ");
                }
            System.out.println();
        }

    } 
    
}
