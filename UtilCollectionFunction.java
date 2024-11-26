import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilCollectionFunction implements Comparable{
    public static void main(String[] args) {
        List<String> cricketer = Arrays.asList("Sanju Samson ","Surykumar Yadav ","Abhiskek Sharma ","Hardik Pandya ","Rinku Singh ","Arshadeep Singh ","Ravi Bishnoi ","Varun Chkrovarti ","Jatish Sharma ","Vijaykumar Vvshek ", "Yashsvi Jayshwal ");
       
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        //Annomous Function
        cricketer.forEach(System.out::print);
        System.out.println();

        //sorting in ascending order
        cricketer.sort(com);
        cricketer.forEach(System.out::print);
        System.out.println();

        //binary search
        cricketer.sort(com);
        int index = Collections.binarySearch(cricketer,"Rinku singh");
        System.out.println("index of rinku singh using binary search is "+index);

        //revers th srting
        Collections.reverse(cricketer);
        cricketer.forEach(System.out::print);

        //sorting in decending order
        cricketer.sort(Collections.reverseOrder());
        cricketer.forEach(System.out::print);
        System.out.println();
        
        //two index swap
        Collections.swap(cricketer, 0, cricketer.size()-1);
        cricketer.forEach(System.out::print);
        System.out.println();

        
    }

    @Override
    public int compareTo(Object o) {
        String s = String.valueOf(o);
        int n=0;
        if (n>=0) {
            return 1;            
        }
        else
        {
            return -1;
        }
    }
}
