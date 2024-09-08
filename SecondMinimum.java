public class SecondMinimum {
    public static void main(String[] args) {
        int a[]={5,4,2,1,3};
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(min1>a[i])
            {
                min1=a[i];
            }
            if(min1<min2 && min2<a[i])
            {
                min2=a[i];
            }
        }
        System.out.println("Second Minimu in Array is  :  "+min2);
    }
}
