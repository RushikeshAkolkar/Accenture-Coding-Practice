import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo implements Comparable<TreeMap>  {
    public static void main(String[] args) {

        Comparator com =new Comparator<T>() {
            
        };

        TreeMap ht = new TreeMap();
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

    @Override
    public int compareTo(TreeMap o) {
        if (o.) {
            
        }
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
