import java.util.Scanner;

public class PerVowels {
        public static int factorial(int fact){
        if(fact==1)
        {
            return 1;
        }
        else{
            return fact*factorial(fact-1);
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s =sc.next();int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                continue;
            }
            else{
                cnt++;
            }
        }
        System.out.println("The Number of Possible Permutation is : "+factorial(cnt));
    }
    
}
