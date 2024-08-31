import java.util.Scanner;

public class Replacess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 =new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i))=='a')
            {
                s1.append('p');
            }
            else if((s.charAt(i))=='p')
            {
                s1.append('a');
            }
            else
            {
                s1.append(s.charAt(i));
            }
            
        }
        System.out.println("After Replacing our String With a to p , p to a is         :"+s1);
    }
}
