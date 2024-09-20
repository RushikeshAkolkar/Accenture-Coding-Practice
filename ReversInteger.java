public class ReversInteger {
    static int reverseInt(int num)
    {
        int d=0,sum=0;
        while(num!=0)
        {
            d=num%10;
            if(d>Integer.MAX_VALUE/10 || d<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            sum=sum*10+d;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(reverseInt(12345));
    }
}
