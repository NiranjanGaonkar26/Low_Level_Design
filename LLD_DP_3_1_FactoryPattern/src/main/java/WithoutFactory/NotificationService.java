package WithoutFactory;

public class NotificationService {

    public void sendNotification(String type, String message){
        switch (type.toLowerCase()){
            case "email": EmailNotification email = new EmailNotification();
                          email.send(message);
                          break;
            case "sms": SmsNotification sms = new SmsNotification();
                        sms.send(message);
                        break;
            case "whatsapp": WhatsappNotification whatsapp = new WhatsappNotification();
                            whatsapp.send(message);
                            break;
            default: throw new RuntimeException("No such notification type");
        }
    }
}
