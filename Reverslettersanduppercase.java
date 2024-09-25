public class Reverslettersanduppercase {
    public static void main(String[] args) {
        String s ="ab-cde";
        System.out.println(reversonlyletters(s));
        
    }
    public static String reversonlyletters(String s)
    {
        /*
        another way is as follow also change method return type as StringBuffer
        StringBuffer sb = ew StringBuffer(s);
        return sb.reverse();
        */ 
        int start=0;
        int end = s.length()-1;
        char[] c = s.toCharArray();
        while (start<end) {
            if(!Character.isLetter(c[end]))
            {
                start++;
            }
            else if(!Character.isLetter(c[end]))
            {
                end--;
            }
            else
            {
                char temp = c[start];
                c[start]=c[end];
                c[end]=temp;
                start++;
                end--;

            }
        }
        return new String(c);
    }
}
