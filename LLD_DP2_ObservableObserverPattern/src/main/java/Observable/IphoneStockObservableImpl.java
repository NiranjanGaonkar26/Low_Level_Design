package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    private int iphoneStock = 0;
    private String productName = "IPhone17 Pro";
    List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver obs) {
        observerList.add(obs);
    }

    @Override
    public void remove(NotificationAlertObserver obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obs : observerList){
            obs.update();
        }
    }

    @Override
    public void setStockData(int newStockAmount) {
        iphoneStock += newStockAmount;
        if(iphoneStock != 0) {
            notifySubscribers();
        }
    }

    @Override
    public int getStockData() {
        return iphoneStock;
    }

    @Override
    public String getProductName(){
        return productName;
    }
}
