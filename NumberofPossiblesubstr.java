import java.util.Scanner;

public class NumberofPossiblesubstr {
    static int subcnt(String str)
    {
        int n = str.length();
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.next();
        System.out.println("The Number of possible subsstrings are : "+subcnt(str));
    }
}
