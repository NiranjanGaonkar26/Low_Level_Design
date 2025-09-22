package Handler;

public class NewLocHandler extends EmailHandler {
    public NewLocHandler(EmailHandler handler, String emailStatus){
        super(handler, emailStatus);
    }

    @Override
    void write(String msg) {
        System.out.println("Content: '"+msg+"' NEW LOCATION EMAIL DETECTED... forwarding to business team");
    }

}
