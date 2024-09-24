import java.util.Scanner;

public class FillAndWithoutFillBottol {
    public static void main(String[] args) {
        int n1=1;
        while (n1!=0) {
            Scanner sc = new Scanner(System.in);
            int bottol=0,emptybottol=0,cnt=0;
            System.out.println("1. Buy A Drink Bottol :");
            System.out.println("2.Empty Drink Bottol Exchange with Filled Drink Bottols");
            System.out.println("3.END");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("How many bottol you want");
                    bottol = sc.nextInt();
                    System.out.println("You buy Bottols "+bottol);
                    System.out.println("1. Buy A Drink Bottol :");
                    System.out.println("2.Empty Drink Bottol Exchange with Filled Drink Bottols");
                    System.out.println("3.END");
                    n=sc.nextInt();  
                    break;                  
                    
                case 2:
                    if (cnt!=0) {
                        bottol=cnt;
                        cnt=0;
                        for(int i=1;i<Integer.MAX_VALUE;i++)
                        {
                            if (bottol>=3) {
                                cnt++;
                                bottol=bottol-3;                            
                            }
                        }
                        
                    }
                    else
                    {
                        System.out.println("How many Empty Bottols do you have : ");
                        emptybottol = sc.nextInt();
                        for(int i=1;i<Integer.MAX_VALUE;i++)
                        {
                            if (emptybottol>=3) {
                                cnt++;
                                emptybottol=emptybottol-3;                            
                            }
                        }
                    }
                    System.out.println("You can Take : "+cnt);

                    System.out.println("1. Buy A Drink Bottol :");
                    System.out.println("2.Empty Drink Bottol Exchange with Filled Drink Bottols");
                    System.out.println("3.END");
                    n=sc.nextInt();
                    break;
                    
                case 3:
                    n1=0;
                    break;
            
                default:
                    break;
            }
        }
    }
}
