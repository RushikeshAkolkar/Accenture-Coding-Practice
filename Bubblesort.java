import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums={3,1,5,4,2};
        System.out.println(Arrays.toString(bubblesort(nums)));
        
    }
    static int[] bubblesort(int []nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }
}
