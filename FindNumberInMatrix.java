import java.util.Scanner;

public class FindNumberInMatrix {
    static boolean targetSearch(int[][] arr, int row,int col,int target)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if (arr[i][j]==target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row and cols want in an array");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("ENter array element's");
        int[] [] arr = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter target element which you want to search in an Matrix Array :");
        int target = sc.nextInt();
        
        if(targetSearch(arr,row,col, target))
        {
            System.out.println("target element is found");
        }
        else
        {
            System.out.println("target element is not found");
        }
    }
}
