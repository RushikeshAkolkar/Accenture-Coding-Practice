import java.util.Scanner;
//jump Game
public class CountNoStep {
    public static int countStep(int n){
        int step=0;
        while(n!=0)
        {
            if(n%2==0)
            {
                n=n/2;
                step++;
            }
            else
            {
                n=n-1;
                step++;
            }
        }
        return step;
    } 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("The Number Of Steps are : " +countStep(n));
        
    }
}
