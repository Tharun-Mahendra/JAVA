public class array 
{
    public static void main (String args[])
    {
        int nums[]={2,5,8,7,6};  //we specify the nums are array by "[]" after the variable and in "{}" numbers u want
                 // 0 1 2 3 4  index value start with 0 
        nums[3]=8;//we are changing the "3" index value from 7->8 
        System.out.println(nums[2]);  //to print particular number specify index value

        
        int nums1[]=new int[4];//we created an empty array with 4 indexes having "0" as value
        nums1[2]=9; //we can assign value to change from 0->9 
        //to fetch all values
        for (int i=0;i<=5;i++)
        {
            System.out.println(nums1[i]);
        }
    }
}
