public class ReverseString {

    static StringBuffer reverstr(String s)
    {
        StringBuffer sb = new StringBuffer();
        String a[] = s.split(" +");          // many spaces counted in middle of the word
        for(int i=a.length-1;i>=0;i--)
        {
            sb.append(a[i]+" ");
        }
        return sb;
    }

    public static void main(String[] args) {
        String s = "   the sky    is blue";
        System.out.println("Reverse of a String is : "+reverstr(s));
    }
    
}
