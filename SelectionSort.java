import java.util.Arrays;

public class SelectionSort {
    static int[] selectionsort(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
}
