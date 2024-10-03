import java.util.Scanner;

public class Meta_Number {
    static int metanumber(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if (i%1==0 && i%2==0 && i%4 ==0 && i%10!=0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number max range to search how many meta number is found");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Maximum number of meta number is : "+metanumber(n));
    }
}
