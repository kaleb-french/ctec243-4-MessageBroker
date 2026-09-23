public class Main {
    static void main() {
        LinkedQueue<Message> queue = new LinkedQueue<>();
        Message m1 = new Message("Hello from message 1.", "1");
        Message m2 = new Message("Hello from message 2.", "2");
        Message m3 = new Message("Hello from message 3.", "3");

        queue.enqueue(m1);
        queue.enqueue(m2);
        queue.enqueue(m3);

        System.out.println(queue.dequeue().toString());
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.dequeue().toString());
    }
}
