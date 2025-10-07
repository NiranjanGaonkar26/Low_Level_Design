package WithFactory.Consumer;

import WithFactory.Factory.NotificationFactory;
import WithFactory.Factory.SmsNotification;

public class SmsCreator extends NotificationService{
    @Override
    public NotificationFactory createNotificationObject() {
        return new SmsNotification();
    }
}
