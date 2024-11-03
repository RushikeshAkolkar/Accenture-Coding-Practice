public class LargestNoinArray {
    static int larestNumber(int[] arr)
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5,23,5,1,5,6,8};
        System.out.println("Lrgest Number in an Array is : "+larestNumber(arr));
    }
}
