import java.util.Scanner;

class Reversestr{
    static StringBuffer reversestr(String str)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Reverse String : "+reversestr(str)); 
    }
}