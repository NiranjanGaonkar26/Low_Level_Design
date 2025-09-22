package Handler;

public class FanHandler extends EmailHandler{

    public FanHandler(EmailHandler handler, String emailStatus){
        super(handler, emailStatus);
    }

    @Override
    void write(String msg) {
        System.out.println("Content: '"+msg+"' FAN EMAIL DETECTED... forwarding to CEO");
    }

}
