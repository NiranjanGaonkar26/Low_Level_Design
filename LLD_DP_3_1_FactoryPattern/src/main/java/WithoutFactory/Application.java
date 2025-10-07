package WithoutFactory;

public class Application {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Whatsapp", "Yo boi, how's it going");
    }
}
