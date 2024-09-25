public class SubSequnces {
    public static void main(String[] args) {
        String str1="abc";
        String str2="ahbgdc";
        System.out.println("SubSequnces of String is : "+ subsequnces(str1,str2));
    }
    public static boolean subsequnces(String s1,String s2)
    {
        if(s1.length()==0)
        {
            return true;
        }
        int i=0;
        int j=0;

        while (i<s1.length() && j<s2.length()) {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;j++;
            }
            else
            {
                j++;
            }
        }
        if(i==s1.length())
        {
            return true;
        }
        return false;
    }
}
