import java.util.Scanner;

public class DicePossiblity {
    static int DicePosibility(int sum)
    {
        if(sum<2  || sum>12)
        {
            return 0;
        }
        int count = 0;
        for(int i=0;i<=6;i++)
        {
            if(sum-i >=1 && sum-i <=6)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        System.out.println("The Dice Possibility is : "+DicePosibility(sum));
        
    }
}
