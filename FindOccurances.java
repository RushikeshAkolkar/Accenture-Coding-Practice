import java.util.Scanner;

public class FindOccurances {
    static void firstlastoccurances(int a[],int k)
    {
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                System.out.println("First Occurances is : "+i);
            }
        }
        for(int i=a.length-1;i>0;i++)
        {
            if (a[i]==k) 
            {
                System.out.println("Last Occurances is : "+i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element do you want : ");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("which element do you want to find in an array : ");
        int k=sc.nextInt();
        firstlastoccurances(a, k);
    }
}
