import java.util.Random;

public class Broker {
    private Random rand = new Random();
    final private int MAX_RETRIES = 3;
    //a
    private LinkedQueue<Message> queue = new LinkedQueue<>();
    private LinkedQueue<Message> dlQueue = new LinkedQueue<>();
    //c
    Broker(){

    }
    //m
    public void addMessage(Message m){
        queue.enqueue(m);
    }
    public void proccessMessages(){
        if(queue.getNumElements() == 0){
            return;
        }
        System.out.println(queue.getNumElements());
        int numElements = queue.getNumElements();
        while(!queue.isEmpty()){
            Message m = queue.dequeue();
            if(rand.nextInt(0,100) < m.successChance){
                System.out.println("Proccess Success: " + m.toString());
            }else{
                if(m.getRetryCount() >= MAX_RETRIES){
                    System.out.println("Message Sent to Dead Letter Queue: " + m.toString());
                    dlQueue.enqueue(m);
                    continue;
                }
                System.out.println("Process Failed!" + m.toString());
                m.retryCountUp();
                queue.enqueue(m);
            }
        }
    }
    public void clearDLQ(){
        int numElements = dlQueue.getNumElements();
        for(int i = 0; i < numElements; i++){
            Message m = dlQueue.dequeue();
            System.out.println(i + " " + m.toString());
        }
        System.out.println("DLQ CLEARED!");
    }
}
