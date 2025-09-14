package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email;
    StockObservable obsObj;

    public EmailAlertObserver(String email, StockObservable obsObj){
        this.email = email;
        this.obsObj = obsObj;
    }

    @Override
    public void update() {
        sendEmail(email, "Dear user there are "+obsObj.getStockData()+" "+obsObj.getProductName()+" in stock, Hurry Up!!!");
    }

    public void sendEmail(String email, String msg){
        System.out.println("Sending '"+msg+"' to "+email);
    }
}
