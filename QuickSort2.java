public class QuickSort2 {
    static int Patition(int[] a,int l,int u)
    {
        int pivot=a[l];
        int i = l-1;
        for(int j =l;j<u;j++)
        {
            if (a[j]<pivot) {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,u);
        return i+1;
    }
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void QuickSort(int []a,int l,int u)
    {
        if (l<u) {
            int p = Patition(a,l,u);
            QuickSort(a, l, p-1);
            QuickSort(a, p+1, u);
        }
        
    }
    public static void main(String[] args) {
        int a[] = {10,7,8,9,1,5};
        int n=a.length;
        QuickSort(a,0,n-1);
        for(int b=0;b<a.length;b++)
        {
            System.out.println(a[b]+" ");
        }
    }
}
