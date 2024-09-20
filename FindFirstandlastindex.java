import java.util.Arrays;

public class FindFirstandlastindex {
    static int[] firstlastindexinarray(int[] nums, int target)
    {
        int result[]=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                result[j++]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                result[j++]=i;
                break;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target = 8;
        int[] result=firstlastindexinarray(nums,target);
        System.out.println("First and Last index of specified element is : "+Arrays.toString(result));
    }
}
