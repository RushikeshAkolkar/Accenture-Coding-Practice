import java.util.Scanner;

class Powerofopr{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Value A : ");
        int a= sc.nextInt();
        System.out.println("Enter Valu B : ");
        int b= sc.nextInt();
        int c = (int) Math.pow(a, b);
        System.out.println("Power is = "+c);
    }
}