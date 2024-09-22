import java.util.ArrayList;
import java.util.List;

public class LengthStringLongestwithoutRepetingCharacter {
    public static void lengthofwithoutrepetingstring(String a) {
        int start=0,end=0;
        int maxlength=0;
        List<Character> l =new ArrayList<Character>();

        while(end<a.length())
        {
            if(!l.contains(a.charAt(end)))
            {
                l.add(a.charAt(end));
                end++;
                maxlength=Math.max(maxlength, l.size());

            }
            else
            {
                l.remove(Character.valueOf(a.charAt(start)));
                start++;
               //  l.remove(a.charAt(start));    for this mrthod we will get output as : ArrayIndexOutOfBoundException
            }
        }
        System.out.println(maxlength);
    }
    public static void main(String[] args) {
        String a="abcabcbb";
        lengthofwithoutrepetingstring(a);
    }
}
