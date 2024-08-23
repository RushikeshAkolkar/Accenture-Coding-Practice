import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class rat_unit_house {
    public static int solve(int arr[],int n,int r,int unit){
        if(arr==null)
        {
            return -1;
        }
        int res=r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            count++;
            if(sum>=res)
            {
                break;
            }
        }
        if(sum<res)
        {
            return 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many rat present");
        int r=sc.nextInt();
        System.out.println("how many unit require");
        int unit=sc.nextInt();
        System.out.println("how many array element do you want in array");
        int n=sc.nextInt();
        System.out.println("Enter Arrya Elements");
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(solve(a,n,r,unit));
    }
}