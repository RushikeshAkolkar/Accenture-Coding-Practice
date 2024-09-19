//input 8
//1,2,3,4,4,5,5,5
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestCount {
    static int secondlargest(int arr[],int n)
    { int temp=0,b=0,secondlargest=0;
        Arrays.sort(arr);
        for(int i=n-1;i>0;i--)
        {
            if(arr[n-1]!=arr[i])
            {
                secondlargest = arr[i];
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(secondlargest == arr[i])
            {
                b++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How Many Number You want in Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result = secondlargest(arr,n);
        System.out.println("Second Largest Array Element Count is : "+result);
    }
}
