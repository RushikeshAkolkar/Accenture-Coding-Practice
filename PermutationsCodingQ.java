import java.util.Scanner;

public class PermutationsCodingQ {
    public static int factorial(int fact){
        if(fact==1)
        {
            return 1;
        }
        else{
            return fact*factorial(fact-1);
        }
    
    }
    public static void main(String[] args) {
        String s ="abc";int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            cnt++;
        }
        System.out.println("The Number of Possible Permutation is : "+factorial(cnt));
    }
}
