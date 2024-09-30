import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    static boolean isperfect(int a)
    {
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if (a%i==0) {
                sum=sum+i;
            }
        }
        if (sum==a) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("enter your max range :");
        Scanner sc = new Scanner(System.in);
        int max=sc.nextInt();
        int k=0;
        ArrayList<Integer> al =new ArrayList<Integer>();
        for(int min=1 ; min<=max;min++)
        {
            if(isperfect(min))
            {
                al.add(min);
            }
        }
        System.out.println(al);
    }
}
