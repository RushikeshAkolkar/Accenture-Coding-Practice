public class Prefixcheck {
    static int checkPrefix(String a,String b)
    {
        String[] c=a.split(" ");
        for(int i=0;i<a.length();i++)
        {
            if(c[i].startsWith(b))
            {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String a = "I love to Eat Burger";
        String check = "Burge";
        int result = checkPrefix(a, check);
        System.out.println("The word is found at index "+result);
    }
}
