package Topics.MultiThread;

public class Daemon extends Thread {

    @Override
    public void run() {

        while (true){
            System.out.println("Hello world");
        }
    }


    public static void main(String[] args) {
        Daemon myThread = new Daemon();
        // that will be say to os and jvm to execute that thread in the background
        myThread.setDaemon(true); // that will stop after terminating the main or another user thread will be terminated
        myThread.start();
    }


    // Daemon threads that will be run on the background

}
