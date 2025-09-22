package Handler;

public class SpamHandler extends EmailHandler{

    public SpamHandler(EmailHandler handler){
        super(handler);
    }

    @Override
    public void handleEmailRequest(String status, String msg) {
        if (status.equals(spamStatus)){
            System.out.println("SPAM DETECTED... Deleting the email");
        }
        else{
            if(successor != null){
                successor.handleEmailRequest(status, msg);
            }
        }
    }
}
