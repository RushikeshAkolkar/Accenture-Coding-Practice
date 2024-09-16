public class Divisibleby3 {
    static int avrageofnumber(int[] a)
    {
        int avg=0,sum=0,cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if (a[i]%3==0 && a[i]%2==0) {
                sum=sum+a[i];
                cnt++;
            }
        }
        avg = sum/cnt;
        return avg;
    }
    public static void main(String[] args) {
        int a[] = {3,6,9,12,15,18,21};
        int result = avrageofnumber(a);
        System.out.println("Average of Three Numbers that are divisible by 3 and even is : "+result);
    }
}
