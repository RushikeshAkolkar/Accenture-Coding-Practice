import java.util.Arrays;

class MoveZero
{
    static int[] MoveZero(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length)
        {
            nums[count++]=0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        System.out.println("Moveing Zero at the end, then required array is as follow's  \n"+Arrays.toString(MoveZero(nums)));
    }
}