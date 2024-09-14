public class ThreeCongicativeOddNo {
    static boolean threecongicativeNoArray(int a[])
    {
        boolean flag = false;
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]%2==1)
            {
                if (a[i+1]%2==1) 
                {
                    if (a[i+2]%2==1) 
                    {
                        flag=true;
                    }
                    else{
                        continue;
                    }
                }
                else
                {
                    continue;
                }
            }
            else
            {
                continue;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        boolean res;
        int a[]={2,6,4,1};
        res=threecongicativeNoArray(a);
        System.out.println("In the given array Reslut is :"+res+" ");
        int aa[]={1,2,34,3,4,5,7,23,12};
        res=threecongicativeNoArray(aa);
        System.out.println("In the given array Reslut is :"+res+" ");
    }
}
