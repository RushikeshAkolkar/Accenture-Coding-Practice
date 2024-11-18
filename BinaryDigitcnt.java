import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("which digit you want : ");
        int n = Integer.parseInt(sc.readLine());
        System.out.println("the sum of binary digit and it's sum of 1 is : "+functionSum(n));
    }
}
