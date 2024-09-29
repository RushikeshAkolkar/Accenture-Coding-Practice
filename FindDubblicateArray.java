import java.util.Arrays;

class FindDubblicateArray{
    static int[] finddubblicatearray(int nums[],int n)
    {
        int i=0;int k=0;
        Arrays.sort(nums);
        int[] temp = new int[n];
        for(;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    temp[k++]=nums[j];
                }
                else
                {
                    continue;
                }

            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] nums= {1,5,6,1,2,3,5,6,7,4,2,8,9,6};
        int n=nums.length;
        System.out.println(Arrays.toString(finddubblicatearray(nums,n)));
    }
}