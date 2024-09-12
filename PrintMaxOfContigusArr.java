import java.util.ArrayList;

public class PrintMaxOfContigusArr {
    @SuppressWarnings("unchecked")
    static ArrayList MaxContigusArr(int a[],int k)
    {
        ArrayList al =new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=k)
            {
                al.add(a[i]);
            }
        }
        return al;
        
    }
    public static void main(String[] args) {
        int a[] ={1,-3,3,-1,5,3,6,7};
        int k = 3;
        System.out.println("Max Of Contigus Array is : "+MaxContigusArr(a,k));
    }
}
