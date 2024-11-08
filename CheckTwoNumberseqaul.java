import java.util.Scanner;

/**
 * CheckTwoNumberseqaul
 */
public class CheckTwoNumberseqaul {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        if(a-b==0)
        {
            System.err.println("Both the number's are equal");
        }
        else
        {
            System.out.println("Both the number's are Not equal");
        }
    }
}