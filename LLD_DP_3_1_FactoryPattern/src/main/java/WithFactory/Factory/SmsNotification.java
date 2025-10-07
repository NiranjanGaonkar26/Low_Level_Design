package WithFactory.Factory;

public class SmsNotification implements NotificationFactory{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+message);
    }
}
