import java.util.Scanner;

public class FindSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many element want in an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        for (int num : a) {
            if(num>largest)
            {
                Secondlargest = largest;
                largest = num;
            }
            else if (num>Secondlargest && num != largest) {
                Secondlargest = num;
            }
        }
        System.out.println("Second Largest Number is :"+Secondlargest);
    }
}
