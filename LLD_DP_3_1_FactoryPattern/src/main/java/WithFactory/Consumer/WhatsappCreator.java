package WithFactory.Consumer;

import WithFactory.Factory.NotificationFactory;
import WithFactory.Factory.WhatsappNotification;

public class WhatsappCreator extends NotificationService{
    @Override
    public NotificationFactory createNotificationObject() {
        return new WhatsappNotification();
    }
}
