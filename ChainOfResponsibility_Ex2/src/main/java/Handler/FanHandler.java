package Handler;

public class FanHandler extends EmailHandler{

    public FanHandler(EmailHandler handler){
        super(handler);
    }
    @Override
    public void handleEmailRequest(String status, String msg) {
        if (status.equals(fanStatus)){
            System.out.println("FAN EMAIL DETECTED... forwarding to CEO");
        }
        else{
            if(successor != null){
                successor.handleEmailRequest(status, msg);
            }
        }
    }
}
