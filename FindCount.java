public class FindCount {
    public static int FindCount(int a[],int length,int num, int diff)
    {
        int count=0;
        for(int i=0;i<length;i++)
        {
            if((Math.abs(a[i]-num))<=diff)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int length,num,diff;
        length = 6;
        num = 13;
        diff = 2;
        int a[]={12,3,14,56,77,13};
        int res=FindCount(a,length,num,diff);
        System.out.println("Result of Count difference   :   "+res);
    }
}
