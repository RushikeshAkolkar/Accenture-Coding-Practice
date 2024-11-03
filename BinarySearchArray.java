import java.util.Scanner;

public class BinarySearchArray {
    static int binarysearch(int a[],int search)
    {
        int first=0;
        int last=a.length;
        while (first<=last) {
            int mid =(first+last)/2;
            if(a[mid]==search)
            {
                return mid;
            }
            if (a[mid]<search) {
                first = mid+1;
            }
            if (a[mid]>search) {
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number want in array ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter number you want to search : ");
        int search = sc.nextInt();
        int index = binarysearch(a,search);
        if (index>=0) {
            System.out.println("Search element is found at index : "+index);
        }
        else
        {
            System.out.println("Not Found");
        }
        
    }
}
