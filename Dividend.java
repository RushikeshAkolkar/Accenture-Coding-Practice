public class Dividend {
    static int dividend(int arr[],int divisor,int quotient,int reminder)
    {
        int divi = quotient*divisor+reminder;
        for(int i=0;i<arr.length;i++)
        {
            if (divi == arr[i]) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={4,2,6,8};
        int divisor=1;
        int quotient = 2;
        int reminder =0;
        System.out.println("index - >"+dividend(arr,divisor,quotient,reminder));
    }
}
