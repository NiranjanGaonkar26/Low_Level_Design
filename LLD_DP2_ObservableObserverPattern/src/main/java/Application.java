import Observable.IphoneStockObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.NotificationAlertObserver;
import Observer.PhoneAlertObserver;

public class Application {
    public static void main(String[] args) {

       StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver emailObserver1 = new EmailAlertObserver("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver emailObserver2 = new EmailAlertObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver phoneObserver1 = new PhoneAlertObserver(1234567890, iphoneStockObservable);

        iphoneStockObservable.add(emailObserver1);
        iphoneStockObservable.add(emailObserver2);
        iphoneStockObservable.add(phoneObserver1);

        iphoneStockObservable.setStockData(10);
        iphoneStockObservable.setStockData(-10);
        iphoneStockObservable.setStockData(30);
    }
}
