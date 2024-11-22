import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class NoofOccueances {
    static void noofoccurances(String s1)
    {
        int cnt=0;
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        String[] s2 = s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            m.put(s2[i], 0);
        }
        for(int j=0;j<s2.length;j++)
        {
            String word = s2[j];
            for (Entry<String,Integer> entrySet : m.entrySet()) {
                if (entrySet.getKey()==word) {
                    cnt=(int)entrySet.getValue();
                    cnt++;
                    m.put(entrySet.getKey(), cnt);
                }
            }
        }
        m.entrySet().forEach(
            input -> System.out.println(input.getKey()+"   "+input.getValue()+"\n"));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String which you want to find specific word occurances in string :");
        String s1 = sc.nextLine();
        System.out.println("Enter Word you want to find occurances of word in string : ");
        String word = sc.nextLine();
        noofoccurances(s1);
    }
}
