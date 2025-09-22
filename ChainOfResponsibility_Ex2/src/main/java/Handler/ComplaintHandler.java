package Handler;

public class ComplaintHandler extends EmailHandler{

    public ComplaintHandler(EmailHandler handler, String emailStatus){
        super(handler, emailStatus);
    }

    @Override
    void write(String msg) {
        System.out.println("Content: '"+msg+"' COMPLAINT EMAIL DETECTED... forwarding to legal team");
    }

}
