package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver obs);
    public void remove(NotificationAlertObserver obs);
    public void notifySubscribers();
    public void setStockData(int newStockAmount);
    public int getStockData();
    public String getProductName();
}
