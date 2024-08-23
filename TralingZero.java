import java.util.Scanner;

public class TralingZero {
    public static int tralingzero(int n)
    {
        int count = 0;
        for(int i=5;n/i>=1;i=i*5)
        {
            count=count+n/i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Tralling Zeros is : "+tralingzero(n));
    }
}
