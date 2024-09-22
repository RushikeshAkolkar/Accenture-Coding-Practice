public class Findnonrepeatingfirstcharacter {
    static int indeOfnonrepeatingcharacter(String a)
    {
        int frequence[] = new int[26];
        char[] chars = a.toCharArray();
        for(char c : chars)
        {
            frequence[c-'a']++;
        }
        for(int i=0;i<chars.length;i++)
        {
            if(frequence[chars[i]-'a']==1)
            {
                return i;
            }
            else 
            {
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("n0on repeting charater is At index : "+indeOfnonrepeatingcharacter(s));
    }
}
