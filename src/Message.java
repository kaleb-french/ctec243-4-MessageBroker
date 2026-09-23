public class Message {
    //a
    private String messageId;
    private String payload;
    private int retryCount = 0;
    //c
        Message(String payload, String messageId){
            this.payload = payload;
            this.messageId = messageId;
        }
    //m
    public String toString(){
        return "Message ID: " + this.messageId + " Payload: " + this.payload + " Retry Count: " + this.retryCount;
    }

}
