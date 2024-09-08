public class HighestGoleTeam {
    static char goleTeam(String s)
    {
        int cnta=0,cntb=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                cnta++;
            }
            else if(s.charAt(i)=='B')
            {
                cntb++;
            }
        }
        return cnta>=cntb?'A':'B';
    }
    public static void main(String[] args) {
        String s = "TeamA TeamB TeamA TeamA TeamB Team A";
        System.out.println("Highest gole Scored By Team  :  "+goleTeam(s));
    }
}
