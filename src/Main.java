import java.util.Scanner;

public class Main {
    static void main() {
        Broker broker = new Broker();
        boolean running = true;
        Scanner scan = new Scanner(System.in);
        while(running){
            System.out.println("Welcome! \n 1. add new message. \n 2. proccess messages \n 3 Clear Dead Letter Queue. \n 4. exit");
            String input = scan.nextLine();
            switch(input){
                case "1":
                    System.out.println("Enter Message:");
                    String mInput = scan.nextLine();
                    System.out.println("Enter Message ID");
                    String idInput = scan.nextLine();
                    System.out.println("Enter Success Chance");
                    int scInput = scan.nextInt();
                    Message m = new Message(mInput, idInput, scInput);
                    broker.addMessage(m);
                    break;
                case "2":
                    broker.proccessMessages();
                    break;
                case "3":
                    broker.clearDLQ();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Entry!");
                    continue;
            }
        }
    }
}
