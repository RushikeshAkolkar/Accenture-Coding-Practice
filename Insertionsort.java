import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] nums={0,-23,56,18};
        System.out.println(Arrays.toString(insertionsort(nums)));
    }
    static int[] insertionsort(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
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
