import java.util.Scanner;

public class Penltity{
    
    public static int penltity(int a[],int n)
    {
        int res =0;
        for(int i=1;i<n;i++)
        {
            res = res+(a[i]-a[i-1]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int result=penltity(a,n);
        System.out.println(result);
    }
}