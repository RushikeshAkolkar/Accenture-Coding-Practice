public class RemoveDublicate {
    public static void main(String[] args) {
        int nums[]={0,0,0,1,1,1,1,2,2,3,3,4,5};
        System.out.println(removedublicate(nums));
    }
    static int removedublicate(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
