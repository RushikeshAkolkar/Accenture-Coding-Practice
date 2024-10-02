import java.util.Scanner;

public class ReboundHight {
     public static void main (String [] args) {
        ReboundHight h = new ReboundHight();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the hight");
        Double height = sc.nextDouble();
        System.out.print("How many Bounces You want : ");
        int n=sc.nextInt();
        System.out.println("The hight to which the ball rebounds after "+n+" bounces is :"+h. function (height,n)); 
        

        }
        public Double function (Double height,int n) 
        {
            double count = 0; 
            for (int I = 0; I <n; I ++) 
            {
                count += height + height/2;
                 height/= 2;
            } 
            return height;
        }
}
