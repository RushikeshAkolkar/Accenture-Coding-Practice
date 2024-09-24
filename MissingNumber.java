import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    static int missingnumber(int[] nums)
    {
        int missing = 0;
        Arrays.sort(nums);
        int min=nums[0];
        int max = nums[(nums.length) - 1];
        for(;min<max;min++)
        {
            if(nums[min]!=min)
            {
                return missing=min;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] nums={1,2,5,6,3,0,7,9};
        System.out.println(missingnumber(nums));
    }
}
