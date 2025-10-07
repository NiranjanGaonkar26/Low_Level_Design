package WithFactory.Factory;

public class EmailNotification implements NotificationFactory{
    @Override
    public void send(String message) {
        System.out.println("Sending Email: "+message);
    }
}
