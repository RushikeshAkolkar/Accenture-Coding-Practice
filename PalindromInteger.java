public class PalindromInteger {
    static boolean ispalindrom(int number)
    {
        int sum=0;
        int temp=number;
        while (temp>0) {
            sum=sum*10+temp%10;
            temp=temp/10;
        }
        return sum==number?true:false;
    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println("The number is palindrom or not : "+ispalindrom(number));
    }
}
