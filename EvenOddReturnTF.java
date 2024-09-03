class EvenOddReturnTF{
    static void function(int n,int num1,int num2)
    {
        boolean b;
        if(n%num1==0 && n%num2==0)
        {
            b=true;
        }
        b=false;
        if(b=true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        int n=8;
        int num1=2;
        int num2=-4;
        function(n,num1,num2);
    }
}