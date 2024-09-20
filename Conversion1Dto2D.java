public class Conversion1Dto2D {
    static void twoDArray(int[] a,int m,int n)
    {
        int k=0;
        int result[][]=new int[m][n];
        for(int row = 0;row<m;row++)
        {
            for(int col = 0;col<n;col++)
            {
                result[row][col]=a[k++];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};
        int m=2;
        int n=3;
        
        System.out.println("after conversion of 1d array to 2d array");
        twoDArray(a,m,n);
       
    }
}
