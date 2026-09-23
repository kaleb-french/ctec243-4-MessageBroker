import java.util.Random;
public class Message {
    private Random rand = new Random();
    //a
    private String messageId;
    private String payload;
    private int retryCount = 0;
    public int successChance = rand.nextInt(0,100);
    //c
        Message(String payload, String messageId){
            this.payload = payload;
            this.messageId = messageId;
        }
    //m
    public String toString(){
        return "Message ID: " + this.messageId + " Payload: " + this.payload + " Retry Count: " + this.retryCount;
    }
    public void retryCountUp(){
        this.retryCount++;
    }
}
