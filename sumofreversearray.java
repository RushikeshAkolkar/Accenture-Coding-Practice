public class sumofreversearray {
    static int Revsum(int[] a,int n)
    {
        int sum=0;
        for(int i=n-1;i>=0;i=i-2)
        {
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int n=6;
        System.out.println("Sum of even index position number occured after reversing the array  :   " + Revsum(a,n));
    }
}
