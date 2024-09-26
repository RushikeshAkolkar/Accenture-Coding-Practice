public class MergeStringsAltrernately {
        
    public static void main(String[] args) {
    String word1 = "abc";
    String word2 ="pqr";
    System.out.println(mergestringalternatively(word1,word2));
    }
    static StringBuffer mergestringalternatively(String word1,String word2)
    {
        StringBuffer sb =new StringBuffer();int i=0;
        while (word1.length()>i || word2.length()>i) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        return sb;
    }
}
