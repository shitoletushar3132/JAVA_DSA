package Topics.MultiThread;

public class MultiThreading extends Thread {

    MultiThreading(String name){
        super(name);
    }
    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" - priority: "+ Thread.currentThread().getPriority());

            Thread.yield(); // this will says give the chance to each thread
            try{
              Thread.sleep(1000);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
       // World world = new World(); // state -> new thread created
        // world.start(); // runnable -> thread will be start but not running waiting for the cpu allocation

        MultiThreading m1 = new MultiThreading("kunal");
        m1.start();
        //m1.join(); // that method will be put the main thread for waiting until the that thread will be completed.


        MultiThreading m2 = new MultiThreading("tushar");
        m2.setPriority(Thread.MAX_PRIORITY);
        m2.start();

        System.out.println("Main");



    }
}
