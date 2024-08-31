public class SetBitCoding {
    public static int Setbit(int n, int set)
    {
        int sum=0;
        String s;
        int i=0;
        int count=0;
        int number;
        while(true)
        {
            s=Integer.toString(i,2);
            count = 0;
            if((s.length())<=3)
            {
                for (int j=0;j<s.length();j++)
                {
                    if((s.charAt(j))=='1')
                    {
                        count++;
                    }
                }
            }
            else
            {
                break;
            }           
            if(count==set)
            {
                number=Integer.parseInt(s,2);

                sum=sum+number;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=3,set=2;
        System.out.println(Setbit(n,set));
    }
}
