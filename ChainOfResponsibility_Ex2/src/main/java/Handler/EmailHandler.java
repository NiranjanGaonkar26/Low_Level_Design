package Handler;

public abstract class EmailHandler {

    protected EmailHandler successor;
    static final String spamStatus = "SPAM";
    static final String complaintStatus = "COMPLAINT";
    static final String fanStatus = "FAN";
    static final String newLocStatus = "NEWLOC";

    public EmailHandler(EmailHandler successor) {
        this.successor = successor;
    }

    abstract public void handleEmailRequest(String status, String msg);
}
