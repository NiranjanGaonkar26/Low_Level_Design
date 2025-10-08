package Factories;

import Products.Button;
import Products.Checkbox;
import Products.WindowsButton;
import Products.WindowsCheckbox;

public class WindowsFactory implements AbstractOSUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
