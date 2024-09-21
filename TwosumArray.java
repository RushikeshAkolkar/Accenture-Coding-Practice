import java.util.Arrays;
import java.util.HashMap;

public class TwosumArray {
    static int[] twosum(int num[],int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++)
        {
            int requied_ele = target-num[i];
            if(hm.containsKey(requied_ele))
            {
                int arr[]={hm.get(requied_ele),i};
                return arr;
            }
            hm.put(num[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] num = {3,2,4};
        int target =6;
        System.out.println("The Two Sum problem solution is : "+Arrays.toString(twosum(num, target)));
    }
}
