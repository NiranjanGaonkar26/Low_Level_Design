package Factories;

import Products.Button;
import Products.Checkbox;
import Products.MacOSButton;
import Products.MacOSCheckbox;

public class MacOSFactory implements AbstractOSUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
