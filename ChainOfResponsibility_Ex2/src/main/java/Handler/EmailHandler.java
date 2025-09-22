package Handler;

public abstract class EmailHandler {

    public static final String spamStatus = "SPAM";
    public static final String complaintStatus = "COMPLAINT";
    public static final String fanStatus = "FAN";
    public static final String newLocStatus = "NEWLOC";

    protected EmailHandler successor;
    protected String emailStatus;

    public EmailHandler(EmailHandler successor, String emailStatus) {
        this.successor = successor;
        this.emailStatus = emailStatus;
    }

    public void handleEmailRequest(String status, String msg){
        if(this.emailStatus.equals(status)){
            write(msg);
        }
        else{
            if(this.successor != null){
                successor.handleEmailRequest(status, msg);
            }
        }
    }

    abstract void write(String msg);
}
