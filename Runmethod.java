class myclass1 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i =0;i<20;i++)
        {
            System.out.print(i+", ");
        }
    }

}
class Runmethod extends Thread{
    public static void main(String[] args) {
        myclass1 mm = new myclass1();
        Thread t = new Thread(mm);
        t.start();
        Thread t1 = new Thread(mm);
        t1.start();
    }
    
}