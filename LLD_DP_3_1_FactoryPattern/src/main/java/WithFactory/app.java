package WithFactory;

import WithFactory.Consumer.EmailCreator;
import WithFactory.Consumer.NotificationService;
import WithFactory.Consumer.SmsCreator;

public class app {
    public static void main(String[] args) {
        NotificationService notificationService;

        notificationService = new SmsCreator();
        notificationService.sendMessage("OTP: 123456");

        notificationService = new EmailCreator();
        notificationService.sendMessage("Welcome to IRCTC");
    }
}
