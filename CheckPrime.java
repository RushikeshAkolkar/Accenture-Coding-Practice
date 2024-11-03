import java.util.Scanner;

public class CheckPrime {
    static boolean isprime(int number)
    {
        int sum=0;
        for(int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==number)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Number is a prime or not : "+isprime(number));
    }
}
