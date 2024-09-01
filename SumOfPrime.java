import java.util.Scanner;

class SumOfPrime{

    public static int sumofPrimeNum(int n){
        int count=0,sum=0;
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                sum=sum+i;
            }
            count = 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("How Many Number Do You want in prime Number Sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumofPrimeNum(n);
        System.out.println("The Sum of "+n+" Prime Number is  =  "+res);
    }
}