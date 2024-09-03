public class SumOfLargeArrayMultip {
    static void product(int a[],int n)
    {
        if(n==0)
        {
            System.out.println("N CanNot be 0");
        }
        for(int i=0;i<n;i++)
        {
            int sumS=0;
            int sumL=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    sumS+=a[j];
                }
                else
                {
                    sumL+=a[j];
                }
            }
            a[i]=sumL*sumS;
        }
        System.out.println("Output is  :  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        int a[] = {8,4,5,3,2,6,9, 1};int n=8;

        System.out.println("Input Vlues Are  :  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ "  ");
        }

        System.out.println();
        product(a,n);
    }
}
