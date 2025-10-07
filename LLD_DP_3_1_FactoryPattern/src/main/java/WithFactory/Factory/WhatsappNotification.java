package WithFactory.Factory;

public class WhatsappNotification implements NotificationFactory{
    @Override
    public void send(String message) {
        System.out.println("Sending whatsapp message: "+message);
    }
}
