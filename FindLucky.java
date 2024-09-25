import java.util.ArrayList;

public class FindLucky {
    static int findlucky(int[] nums)
    {
        ArrayList al = new ArrayList<>();
        int luckyno=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!al.contains(nums[i]))
            {
                al.add(nums[i]);
            }
            else
            {
                luckyno = nums[i];
                return luckyno;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={2,2,13,5};
        System.out.println("Lucky integer that occures multiple times is : "+findlucky(nums));
    }
}
