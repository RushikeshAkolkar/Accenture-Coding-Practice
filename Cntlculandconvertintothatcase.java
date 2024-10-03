import java.util.Scanner;

public class Cntlculandconvertintothatcase {
    static String test(String s)
    {
        int uccnt=0;
        int lccnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                uccnt++;
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z') {

                lccnt++;
                
            }
        }
        return lccnt<uccnt?s.toUpperCase():s.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(test(s));
    }
}
