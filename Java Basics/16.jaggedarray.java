public class jaggedarray 
{
    public static void main(String args[])
    {
        int num[][]=new int[3][];//we are keeping columns variable length called jaggedarray
        num[0]=new int[5];  //index 0 row ->5 columns
        num[1]=new int[3];
        num[2]=new int[4];

        for (int i=0;i<num.length;i++) //num.length it takes the length of the array default
        {
            for (int j=0;j<num[i].length;j++)
            {
                num[i][j]=(int)(Math.random()*10);
            }
                       
        }
        //enhanced for loop
        for (int n[]: num)//array value gives address stored in n
        {
            for(int m:n)//n is converted into int and store in m
            {
                System.out.print(m +" ");
            }
            System.out.println();
        }
       
    }     
}
