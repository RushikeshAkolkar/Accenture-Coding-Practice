import java.util.Scanner;

public class HighestGole2{
    static String moregole(String a[])
    {
        int counta=0;
        int countb=0;
        String teama="TeamA";
        String teamb = "TeamB";
        for(int i=0;i<a.length;i++)
        {
            if(teama.equals(a[i]))
            {
                counta++;
            }
            else if(teamb.equals(a[i]))
            {
                countb++;
            }
        }
        return counta>countb?"Team A":"Team B";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] a = new String[20];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        System.out.println("Most of the gole Scored by team  :  "+moregole(a));
    }
}