
public class Main {
    static void main() {
        Broker broker = new Broker();
        Message m1 = new Message("Hello from message 1.", "1");
        Message m2 = new Message("Hello from message 2.", "2");
        Message m3 = new Message("Hello from message 3.", "3");

        broker.addMessage(m1);
        broker.addMessage(m2);
        broker.addMessage(m3);

        broker.proccessMessages();
        broker.proccessMessages();
    }
}
