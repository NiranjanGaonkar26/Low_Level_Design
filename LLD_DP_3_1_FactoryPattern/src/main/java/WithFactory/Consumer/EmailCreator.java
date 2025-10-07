package WithFactory.Consumer;

import WithFactory.Factory.EmailNotification;
import WithFactory.Factory.NotificationFactory;

public class EmailCreator extends NotificationService{
    @Override
    public NotificationFactory createNotificationObject() {
        return new EmailNotification();
    }
}
