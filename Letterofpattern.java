import java.util.HashMap;

public class Letterofpattern {

    
    static boolean check(String pattern,String s)
    {
        String[] a = s.split(" ");
        if(pattern.length()!=a.length)
        {
            return false;
        }
        HashMap<Character,String> hm = new HashMap<Character,String>();
        for(int i=0;i<a.length;i++)
        {
            char ch = pattern.charAt(i);
            boolean containskey=hm.containsKey(ch);
            if(hm.containsKey(a[i]) && !containskey)
            {
                return false;
            }
            if(containskey && !hm.get(ch).equals(a[i]))
            {
                return false;
            }
            else
            {
                hm.put(ch, a[i]);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String pattern="abba";
        String s = "dog cat cat dog";
        System.out.println(check(pattern, s));
    }
}
