public class MaxLengthinArray{
    public static int MinMaxOftwoarray(int a[],int b[],int n1,int n2,int k)
    {
        int cnt1=0,cnt2=0;
        for(int i=0;i<n1&&a[i]>=k;i++)
        {
            cnt1++;
        }

        for(int i=0;i<n1&&b[i]<=k;i++)
        {
            cnt2++;
        }
        int res = Math.max(cnt1, cnt2);
        return res;

    }
    public static void main(String[] args) {
        int a[]={9,16,12,5,15};
        int b[]={14,7,22,5,32,77};
        int n1=a.length;
        int n2=b.length;
        int k=9;
        System.out.println(MinMaxOftwoarray(a,b,n1,n2,k));
    }
}