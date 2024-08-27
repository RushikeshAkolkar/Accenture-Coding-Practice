public class SumOfProduct{
    static int SumofProduct(int a1[],int a2[],int n)
    {
        int sum=0;
        if(n==0)
        {
            return -1;
        }
        for(int i=0;i<n;i++)
        {
           sum+= a1[i]*a2[n-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int a1[]={22,7,1,-5,5,-2};
        int a2[]={4,-1,21,12,10,-3};

        int n=a1.length;
        int res =SumofProduct(a1, a2, n);
        System.out.println("Sum Of the Product : "+res);
    }
}