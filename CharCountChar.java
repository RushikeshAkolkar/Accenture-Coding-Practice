import java.util.Scanner;

public class CharCountChar {
    static StringBuffer charcountchar(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                sb1.append(s.charAt(0));
            }
            else if(i !=s.length()-1)
            {
                count++;
            }
        }
        sb1.append(count);
        sb1.append(s.charAt(s.length()-1));
        return sb1;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.println(charcountchar(s));
    }
}
