public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={9,5,8,2,1,5,3,2,8,9};
        int target = 1;
        System.out.println("Linear Search Target element is : "+LinearSearch(nums,target));
    }
    static String LinearSearch(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return target+" Found";
            }
        }
        return target+" Not Found";
    }
}
