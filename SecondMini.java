import java.util.Arrays;

public class SecondMini {
    public static void main(String[] args) {
        int[] nums={2,6,9,8,11,35,7,};
        System.out.println("Seconde Minimum Number is : "+secondmini(nums));
    }
    static int secondmini(int[] nums)
    {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[0]<nums[i]) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
