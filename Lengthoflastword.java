public class Lengthoflastword{
    public static void main(String[] args) {
        String s="fly to the moon";
        int result=lastwordlength(s);
        System.out.println("Length of last word is : "+result);

    }
    static int lastwordlength(String a)
    {
        String str=a.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}