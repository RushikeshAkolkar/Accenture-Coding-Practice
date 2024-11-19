import java.util.Scanner;

public class NoofOccueances {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String which you want to find specific word occurances in string :");
        String s1 = sc.nextLine();
        String s2[]=s1.split(" ");
        int count=0;
        System.out.println("Enter Word :");
        String s3 = sc.next();
        for(int i=0;i<s2.length;i++)
        {
            if(s3.equals(s2[i]))
            {
                count++;
            }
        }
        System.out.println("Number of Occurances of given string in word is :"+count);
    }
}
