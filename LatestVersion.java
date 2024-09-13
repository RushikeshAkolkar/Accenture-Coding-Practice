class LatestVersion{
    public static int latestvaersion(String[] s)
    {
        int version[] = new int[s.length];
        int v = 0;
        if ((s==null)) {
            return 0;            
        }
        for(int i=0;i<s.length;i++)
        {
            String s1[]=s[i].split("_",s.length);
            for(int j=1;j<s1.length;j=j+2)
            {
                if(s1[j-1].equals("File"))
                {
                    try{
                        version[j] = Integer.valueOf(s1[j]);
                    }
                    catch(Exception e)
                    {
                        continue;
                    }
                }
            }
        }
        for(int k=1;k<version.length;k++)
        {
            if(version[k]>version[k-1])
            {
                v=version[k];
            }
        }

        if(v>0)
        {
            return v;
        }
        else 
        {
            return -1;
        }

        
    }
    public static void main(String[] args) {
        String s[] = {"File_2","File_3","File_4","File_x"};
        int version = latestvaersion(s);

        System.out.println("The Latest Varsion is : "+version);
    }
}