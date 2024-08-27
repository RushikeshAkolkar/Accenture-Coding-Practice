public class Sumofleader {
    static int sumofleader(int a[],int n)
    {
        if ((n==0)) {
            return -1;
        }
        int sum=0;
        int max=a[n-1];
        for(int i=n-1;i>0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
                sum+=a[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[]={52,66,64,36,45,24,32};
        int n = a.length;
        int res=sumofleader(a,n);
        System.out.println("Hences The Result is : "+res);
    }
}
