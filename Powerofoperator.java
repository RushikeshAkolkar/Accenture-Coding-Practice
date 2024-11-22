import java.util.Scanner;

public class Powerofoperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("ENter Second Number ");
        int b = sc.nextInt();
        int c = (int) Math.pow(a, b);
        System.out.println(c);
    }
    
}
