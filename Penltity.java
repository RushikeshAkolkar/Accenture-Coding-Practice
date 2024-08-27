import java.util.Scanner;

public class Penltity{
    static void sort(int a[],int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
    
    public static int penltity(int a[],int n)
    {
        sort(a, n);
        int res =0;
        for(int i=1;i<n;i++)
        {
            res = res+(a[i]-a[i-1]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();// Input 4 -2 1 4 6
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=penltity(a,n);
        System.out.println("Hence's Pentity is : "+result);
    }
}