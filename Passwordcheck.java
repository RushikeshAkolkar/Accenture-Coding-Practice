import java.util.Scanner;

public class Passwordcheck {
    static int password(String s)
    {
        boolean num=false;
        boolean cap=false; 
        if(s.length()<4)
        {
            return 0;
        }
        if(s.charAt(0)>=48 && s.charAt(0)<=57)
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&& s.charAt(i)== ' ')
            {
                return 0;
            }
            else if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                cap = true;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                num = true;
            }
        }
        int res=(cap && num)?1:0;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = password(s);

        if(res==1)
        {
            System.out.println("Password is valid as per condition :  "+s);
        }
        else{
            System.out.println("Password is not valid as per Condition :  "+s);
        }
    }
}
