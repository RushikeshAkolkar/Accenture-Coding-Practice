import java.util.Scanner;

public class checkPalindrom {
    static void ispalindrom(int n)
    {
        int sum=0;
        int temp=n;
        while (temp!=0) {
            sum=sum*10+temp%10;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("Number is Palindrom");
        }
        else{
            System.out.println("Number is not Palindrom");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number to Check Palindrom : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ispalindrom(n);
    }
}
