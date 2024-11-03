import java.util.Scanner;

public class FibinaciSeries {
    static void fibinaciseries(int n)
    {
        int f=0,s=1;
        if (n==1) {
            System.out.println(f);
        }
        if(n==2){
            System.out.println(f+", "+s);
        }
        if(n>=3){
            System.out.println(f+", \n"+s+", ");
            for(int i=3;i<=n;i++)
            {
                int t=f+s;
                System.out.println(t+", ");
                f=s;
                s=t;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("how many number you want in fibinaci series");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fibinaciseries(n);
    }
}
