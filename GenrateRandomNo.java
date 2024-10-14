import java.util.Random;
import java.util.Scanner;

public class GenrateRandomNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random number min and max");
        int min=sc.nextInt();
        int max=sc.nextInt();
        Random rand = new Random();
        for(int i=0;i<20;i++)
        {
            int number=rand.nextInt(max-min+1)+min;
            System.out.println(number);
        }
        
    }
}
