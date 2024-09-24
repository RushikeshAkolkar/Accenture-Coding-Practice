public class Poweroftwo {
    public static boolean poweroftwo(int n)
    {
        int temp = 0;
        if(n==0)
        {
            return false;
        }
        while(n%2!=0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Number is Power of two : "+poweroftwo(n));
    }
}
