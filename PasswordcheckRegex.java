import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordcheckRegex {
    public static void main(String[] args) throws Exception{
        Pattern p=Pattern.compile("^[A-Z0-9]");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Matcher m = p.matcher(s); 
        boolean b = s.length()>=4?true:false;
        if(m.find() && b)
        {
            System.out.println("Password Matches");
        }
        else
        {
            System.out.println("Invalid Password");
        }
    }
}
