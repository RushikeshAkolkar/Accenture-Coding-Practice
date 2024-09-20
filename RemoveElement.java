import java.util.Arrays;

public class RemoveElement {
    static int removeelement(int[] nums,int val)
    {
        int count=0;
        int k=0;
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                temp[count++]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(temp));
        return k;
    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val = 3;
        System.out.println(removeelement(nums,val));
        
    }
}
