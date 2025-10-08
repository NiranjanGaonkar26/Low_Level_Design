import Factories.AbstractOSUIFactory;
import Factories.MacOSFactory;
import Factories.WindowsFactory;
import Products.Button;
import Products.Checkbox;

public class Application {
    private static Button button;
    private static Checkbox checkbox;

    public static void main(String[] args) {
        String os = System.getProperty("os.name");

        AbstractOSUIFactory osuiFactory;
        if (os.contains("Windows")){
            osuiFactory = new WindowsFactory();
        }else {
            osuiFactory = new MacOSFactory();
        }

        button = osuiFactory.createButton();
        checkbox = osuiFactory.createCheckbox();
        Launch();
    }

    public static void Launch(){
        button.paintButton();
        button.onClickButton();
        checkbox.paintCheckbox();
        checkbox.onClickCheckbox();
    }
}
