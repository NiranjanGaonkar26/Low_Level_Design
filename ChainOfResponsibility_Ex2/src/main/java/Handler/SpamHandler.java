package Handler;

public class SpamHandler extends EmailHandler{

    public SpamHandler(EmailHandler handler, String emailStatus){
        super(handler, emailStatus);
    }

    @Override
    void write(String msg) {
        System.out.println("Content: '"+msg+"' SPAM DETECTED... Deleting the email");
    }


}
