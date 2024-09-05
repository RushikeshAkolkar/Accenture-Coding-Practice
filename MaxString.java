import java.util.Scanner;
//input : abc,de,fg,h
public class MaxString{
    public static int calcharmaxinword(String s)
    {
        String s1[]=s.split(",",s.length());
        int maxlength = 0;
        for(int i=0;i<s1.length;i++)
        {
            if((s1[i].length())>maxlength)
            {
                maxlength = s1[i].length();
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The Number of maximum character is   :   "+calcharmaxinword(s));
    }
}