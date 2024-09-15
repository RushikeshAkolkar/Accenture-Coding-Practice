import java.util.Scanner;

public class sumOfTwoNumberWithoutplusopr
{
    static int sumwithoutplusoperator(int a, int b)
    {
        while (b!=0) {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
            System.out.println(b);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        int result = sumwithoutplusoperator(a,b);
        System.out.println("SUM =   "+result);
    }
}