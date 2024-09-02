import java.util.Scanner;

public class AndOrXopOPerations {
    static char AND(char a,char b)
    {
        if(a =='1' && b =='1')
        {
            return '1';
        }
        return '0';
    }
    static char OR(char a,char b)
    {
        if(a=='0' && b=='0')
        {
            return '0';
        }
        return '1';
    }
    static char XOR(char a,char b)
    {
        if(a==b)
        {
            return '0';
        }
        return '1';
    }

    static int BInaryOperations(String s)
    {
        if(s.length()==0)
        {
            return -1;
        }
        char res = s.charAt(0);             //1C0C1C1A0B1
        int i=1;
        for(i=1;i<s.length();i=i+2)
        {
            char op=s.charAt(i);
            char res2 = s.charAt(i+1);
            if(op == 'A')
            {
                res=AND(res,res2);
            }
            if(op == 'B')
            {
                res=OR(res,res2);
            }
            if(op == 'A')
            {
               res=XOR(res,res2);
            }

        }
        if (res=='1') {
            return 1;
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.next();
        ;
        System.out.println("The Result is    :     "+BInaryOperations(str));
    }
    
}
