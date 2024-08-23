import java.util.Hashtable;
import java.util.Iterator;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();
        ht.put("Deepak", 100000);
        ht.put("Abhishek", 1000000);
        ht.put("Rushikesh", 10000000);
        ht.put("Aishwarya", 100000000);
        ht.put("Shravani", 10000000);
        

        int sum=0;
        Object s;
        Iterator itr = ht.keySet().iterator();
        while (itr.hasNext()) {
            s=itr.next();
            sum=sum+(int)(ht.get(s));
            System.out.println("Key:   "+s+"   value   "+ht.get(s)+"   Sum   "+sum);
        }

        
    }
}
