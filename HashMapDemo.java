import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashMapDemo{
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("Deepak", 100000);
        hm.put("Abhishek", 1000000);
        hm.put("Rushikesh", 10000000);
        hm.put("Aishwarya", 100000000);
        hm.put("Shravani", 10000000);

        Iterator i = hm.keySet().iterator();

        while (i.hasNext()) {
            String s = (String)i.next();
            System.out.println("Key:"+s+"   Value:"+hm.get(s));
            
        }

    }
}