public class FindDifference {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="abcde";
        System.out.println("Differences is : "+diffence(str1,str2));
    }
    public static char diffence(String s1,String s2)
    {
        int total = 0;
        for(int i=0;i<s2.length();i++)
        {
            total=total+s2.charAt(i);
        }
        for(int i=0;i<s1.length();i++)
        {
            total=total-s1.charAt(i);
        }
        return (char)total;
    }
}
