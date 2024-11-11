import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLarge {
    static int secondlarge(int a[])
    {
        int n = a.length;
        int s=0;
        Arrays.sort(a);
        int l=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            if(l!=a[i])
            {
                s=a[i];
                break;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element you want in array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Second largest element is : "+secondlarge(a));
    }
}
