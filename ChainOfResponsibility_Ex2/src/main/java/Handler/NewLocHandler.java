package Handler;

public class NewLocHandler extends EmailHandler {
    public NewLocHandler(EmailHandler handler){
        super(handler);
    }
    @Override
    public void handleEmailRequest(String status, String msg) {
        if (status.equals(newLocStatus)){
            System.out.println("NEW LOCATION EMAIL DETECTED... forwarding to business team");
        }
        else{
            if(successor != null){
                successor.handleEmailRequest(status, msg);
            }
        }
    }
}
