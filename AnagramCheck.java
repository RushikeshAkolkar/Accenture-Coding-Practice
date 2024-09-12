public class AnagramCheck {
    static void checkAnagram(String s1,String s2)
    {
        char[] str1=s1.toLowerCase().toCharArray();
        char[] str2=s2.toLowerCase().toCharArray();
        for(int i=0;i<str1.length;i++)
        {
            char temp;
            for(int j=1;j<str1.length;j++)
            {
                if(str1[i]>str1[j])
                {
                    temp=str1[i];
                    str1[i]=str1[j];
                    str1[j]=temp;
                }
            }
        }
        for(int i=0;i<str2.length;i++)
        {
            char temp;
            for(int j=1;j<str2.length;j++)
            {
                if(str2[i]>str2[j])
                {
                    temp=str2[i];
                    str2[i]=str2[j];
                    str2[j]=temp;
                }
            }
        }
        int flag=0;
        if(str1.length==str2.length)
        {
            for(int i=0;i<str1.length;i++)
            {
                if(str1[i]==str2[i])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is not Anagram");
        }


    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        checkAnagram(s1,s2);
    }
}
