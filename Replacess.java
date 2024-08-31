import java.util.Scanner;

public class Replacess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s =new StringBuilder(sc.next());
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i))=='a')
            {
                s.replace("a", "p");
            }
            else if((s.charAt(i))=='p')
            {
                s.replace("p", "a");
            }
        }
        System.out.println("After Replacing our String With a to p , p to a is         :"+s);
    }
}
