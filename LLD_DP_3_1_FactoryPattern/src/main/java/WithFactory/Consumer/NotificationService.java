package WithFactory.Consumer;

import WithFactory.Factory.NotificationFactory;

public abstract class NotificationService {
    public abstract NotificationFactory createNotificationObject();

    public void sendMessage(String message){
        NotificationFactory notification = createNotificationObject();
        notification.send(message);
    }
}
