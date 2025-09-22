package Handler;

public class ComplaintHandler extends EmailHandler{

    public ComplaintHandler(EmailHandler handler){
        super(handler);
    }
    @Override
    public void handleEmailRequest(String status, String msg) {
        if (status.equals(complaintStatus)){
            System.out.println("COMPLAINT EMAIL DETECTED... forwarding to legal team");
        }
        else{
            if(successor != null){
                successor.handleEmailRequest(status, msg);
            }
        }
    }
}
