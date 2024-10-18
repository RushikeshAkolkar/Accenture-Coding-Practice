import java.util.ArrayList;
import java.util.List;

public class Nonrepeatingstr {
    public static void main(String[] args) {
        String a="abcdabcdab";
        System.out.println(a);
        nonrep(a);
    }
    static void nonrep(String a)
    {
        int start=0,end=0,maxlength=0;
        ArrayList l = new ArrayList<>();
        while (end<a.length()) 
        {
            if(!l.contains(a.charAt(end)))
            {
                l.add(a.charAt(end));
                end++;
                maxlength = Math.max(maxlength, l.size());
            }
            else
            {
                l.remove(Character.valueOf(a.charAt(start)));
                start++;
            }
        }
        System.out.println("max length of non repeating sub strings are : "+maxlength);
    }
}
