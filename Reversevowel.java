class Reversevowel{
    static boolean isvowel(char c)
    {
        if(c=='a'|| c=='e' || c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    static String reversstringvowel(String s)
    {
        int n=s.length();
        char ch[]=s.toCharArray();
        int start=0,end=n-1;
        while (start<end) {
            if(!isvowel(ch[start]))
            {
                start++;
            }
            else if(!isvowel(ch[end]))
            {
                end--;
            }
            else
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reversstringvowel(s));

    }
}