import Handler.*;

public class Application {
    public static EmailHandler getEmailHandler(){
        EmailHandler newLocHandler = new NewLocHandler(null, EmailHandler.newLocStatus);
        EmailHandler complaintHandler = new ComplaintHandler(newLocHandler, EmailHandler.complaintStatus);
        EmailHandler fanHandler = new FanHandler(complaintHandler, EmailHandler.fanStatus);
        EmailHandler spamHandler = new SpamHandler(fanHandler, EmailHandler.spamStatus);

        return spamHandler;
    }

    public static void main(String[] args) {
        EmailHandler emailHandler = getEmailHandler();

        emailHandler.handleEmailRequest("NEWLOC", "Super fun product, please open a store in Delhi");
        emailHandler.handleEmailRequest("COMPLAINT", "Very Addictive, stop this at once!!!");
        emailHandler.handleEmailRequest("FAN", "I love this product, a new fan added!");
        emailHandler.handleEmailRequest("SPAM", "Do you want personal loan??");
        emailHandler.handleEmailRequest("NONE", "Do you want personal loan??");
    }
}
