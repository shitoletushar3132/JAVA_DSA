package Topics.MultiThread;

public class Count {

    private int count=0;
    public synchronized void increment(){ // the synchronized meaning not two threads will execute time
        count++;
    }

    public int getCount(){
        return  count;
    }
}
