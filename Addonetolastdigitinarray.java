import java.util.ArrayList;
import java.util.Arrays;

public class Addonetolastdigitinarray {
    static int[] addlast(int[] digits)
    {
       int n=digits.length;
       for(int i=n-1;i>0;i--)
       {
        if(digits[i]<9)
        {
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }
       int[] newNumber=new int[n+1];
       newNumber[0]=1;
       return newNumber;
    }
    public static void main(String[] args) {
        int a[] = {1,2,9};
        int result[];
        //int a[] ={9};
        result=addlast(a);
        System.out.println("After Adding our result is : ");
        System.out.println(Arrays.toString(result));
    }
}