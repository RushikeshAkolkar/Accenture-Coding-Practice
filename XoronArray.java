class XoronArray{
    static int xor(int a, int b)
    {
        if(a!=b)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    static int xorfunction(int[] a)
    {
        int res1 = a[0];
        int res2;
        for(int i=1;i<a.length;i++)
        {
            res2 = a[i];
            res1=xor(res1,res2);
            System.out.println(res1);
        }
        return res1;
    }
    public static void main(String[] args) {
        int a[]={2,2,1};
        int result = xorfunction(a);
        System.out.println("The result after Array Calculation is   :   "+result);
    }
}