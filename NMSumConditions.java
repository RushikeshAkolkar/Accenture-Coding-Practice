class NMSumCoditions{
    static int diff(int n,int m)
    {
        int res1=0;
        int res2=0;
        for(int i=1;i<=m;i++)
        {
            if(i%2==0)
            {
                res1=res1+i;
            }
            else
            {
                res2=res2+i;
            }
        }
        return Math.abs(res1-res2);
    }
    public static void main(String[] args) {
        int n,m;
        n=2;
        m=4;
        int result = diff(2,4);
        System.out.println("Hences Result = "+result);
    }
}