import java.util.Scanner;

public class CountVowel {
    static int cntvowel(String a)
    {
        int cnt=0;
        int n=a.length();
        for(int i=0;i<n;i++)
        {
            if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        System.out.println("Number of vowel's are  :  "+cntvowel(sc.next()));
    }
}
