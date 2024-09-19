public class LeftRotatArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k=3,b=0;
        int temp[] = new int[a.length];
        for(int i=k;i<a.length;i++)
        {
           temp[b++]=a[i];
        }
        for(int j =0;j<k;j++)
        {
            temp[b++]=a[j];
        }
        System.out.print("Array After Left Shift is given bleow \n [");
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]);
        }
        System.out.println("]");
    }
}
