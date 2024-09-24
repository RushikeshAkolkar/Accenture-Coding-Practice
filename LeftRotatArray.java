import java.util.Arrays;

public class LeftRotatArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k=3,b=0;
        int temp[] = new int[a.length];
        for(int i=k;i<a.length;i++)
        {
           temp[b++]=a[i];
        }
        for(int j =0;j<k;j++)
        {
            temp[b++]=a[j];
        }
        System.out.println("Array After Left Shift is given bleow ");
        System.out.println(Arrays.toString(temp));
    }
}
