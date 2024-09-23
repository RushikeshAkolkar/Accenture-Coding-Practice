public class PalindromString {
    static boolean palindromstring(String s) 
    {

        String a =s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        System.out.println(a);
        int i=0;
        int j=a.length()-1;
        while(i<=j)
        {
            if(a.charAt(i)!= a.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)  {
        String s = "a man, A plan a canal: panama";
        System.out.println(palindromstring(s));

    }
}
