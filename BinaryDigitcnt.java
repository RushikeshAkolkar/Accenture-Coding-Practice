import java.util.Scanner;

public class BinaryDigitcnt {
    static int functionSum(int n)
    {
        int sum=0;
        String b = Integer.toString(n,2);
        int temp = Integer.valueOf(b);
        while (temp>0) {
            sum=sum+(temp%10);
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which digit you want : ");
        int n = sc.nextInt();
        System.out.println("the sum of binary digit and it's sum of 1 is : "+functionSum(n));
    }
}
