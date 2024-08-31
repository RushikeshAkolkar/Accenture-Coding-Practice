import java.util.Scanner;

public class AutobiographicalNum {
    public static int Autobiographicalnum(String n)
    {
        int cnt=0;int a[]=new int[10];
        for(int i=0;i<n.length();i++)
        {
             a[n.charAt(i)-'0']++;
        }
        for(int i=0;i<n.length();i++)
        {
            if(a[i]!=n.charAt(i)-'0')
            {
                return 0;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]>0)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( "Auto Bio Num is     :       "+Autobiographicalnum(s));
    }
}
