import java.util.Scanner;

public class PalindromandReverse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb =new StringBuffer(s);
        sb=sb.reverse();
        String s1 = sb.toString();
        System.out.println("Reverse String is  :  "+sb);
        //Palindrom
        if(s.equals(s1))
        {
            System.out.println("Number is Palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
    }
}
