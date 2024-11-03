import java.util.Arrays;

public class MergesortedArray {
    static void mergeandsort(int[] arr1,int[] arr2)
    {
        int n = arr1.length+arr2.length;
        int[] arr3=new int[n];int k=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr3[k++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[k++]=arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void main(String[] args) {
        int[] arr1={4,5,6,8,2,1,5,3,50,87,63};
        int[] arr2={4,5,9,3,6,2,1,87,45,62,52};
        mergeandsort(arr1,arr2);
    }
}
