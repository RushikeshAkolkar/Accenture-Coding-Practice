import java.util.Scanner;

class additionofarray
{
    static void additionarray(int[][] a,int [][]b,int row1,int cols1,int row2,int cols2)
    {
        
        if(row1 != row2 && cols1 != cols2)
        {
            System.out.println("Two array length are different");
        }
        else
        {
            int[][] c =new int[row1][row2];
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<cols1;j++)
                {
                    a[i][j]+=b[i][j];
                }
            }
        }
        System.out.println("After addition of the Array is : ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                System.out.print("   "+a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want");
        int row1 = sc.nextInt();
        System.out.println("How many cols you want");
        int cols1 = sc.nextInt();
        int a[][]=new int[row1][cols1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("How many rows you want in 2nd array");
        int row2 = sc.nextInt();
        System.out.println("How many cols you want in 2nd array");
        int cols2 = sc.nextInt();
        int b[][]=new int[row2][cols2];
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        additionarray(a, b,row1,cols1,row2,cols2);
    }
}