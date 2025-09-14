package Observer;

import Observable.StockObservable;

public class PhoneAlertObserver implements NotificationAlertObserver{
    int phoneNumber;
    StockObservable obsObj;

    public PhoneAlertObserver(int phoneNo, StockObservable obsObj){
        this.phoneNumber = phoneNo;
        this.obsObj = obsObj;
    }

    @Override
    public void update() {
        sendMessage(phoneNumber, "Dear user there are "+obsObj.getStockData()+" "+obsObj.getProductName()+" in stock, Hurry Up!!!");
    }

    public void sendMessage(int phoneNumber, String msg){
        System.out.println("Sending '"+msg+"' to "+phoneNumber);
    }
}
