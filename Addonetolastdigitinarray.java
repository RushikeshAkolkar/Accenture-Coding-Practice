import java.util.ArrayList;

public class Addonetolastdigitinarray {
    static int[] addlast(int ...a)
    {
        int n=a.length,no=0;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==9)
            {
                a[i]= 0;
            }
            else{
                a[i]+=1;
                return a;

            }
        }
        a[0]=1;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int result[];
        //int a[] ={9};
        result=addlast(a);
        System.out.println("After Adding our result is : ");
        System.out.print("[");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+", ");
        }
        System.out.println("]");
    }
}
