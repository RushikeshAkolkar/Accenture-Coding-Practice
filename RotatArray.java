import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RotatArray {
    public static void rotatearrayktimes(Stack s,int k)
    {
        int temp1=0,temp2=0;
        ArrayList a = new Stack<>(s);
        Stack c =new Stack<>(s);
        Queue q = new ConcurrentLinkedQueue<>(s);
        ArrayList a1 = new ArrayList<>();
        
        int b=k;
        for(int e =0;e<s.size()-1;e++,--b)
        {
        if(b>0)
        {
            temp1=(int) s.peek();
                a.add(0, temp1);
                s.pop();
                a1=a;

        }
        System.out.println(a);
    }
}
    public static void main(String[] args) {
        Stack arr = new Stack<>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(7);
        
        int k=3;
        System.out.println("After Performing "+k+" times rotation remining array is :");
        rotatearrayktimes(arr,k);
    }
}
