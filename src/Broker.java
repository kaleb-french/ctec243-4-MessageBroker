import java.util.Random;

public class Broker {
    private Random rand = new Random();
    //a
    private LinkedQueue<Message> queue = new LinkedQueue<>();
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
        for(int i = 0; i < numElements; i++){
            Message m = queue.dequeue();
            if(rand.nextInt(0,100) < m.successChance){
                System.out.println("Proccess Success: " + m.toString());
            }else{
                System.out.println("Process Failed!" + m.toString());
                m.retryCountUp();
                queue.enqueue(m);
            }
        }
    }
}
