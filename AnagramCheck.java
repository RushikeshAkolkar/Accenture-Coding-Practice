import java.util.Arrays;

public class AnagramCheck {
    static void checkAnagram(String s1,String s2)
    {
        char[] str1=s1.toLowerCase().toCharArray();
        char[] str2=s2.toLowerCase().toCharArray();
        Arrays.sort(str2);
        Arrays.sort(str1);
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
