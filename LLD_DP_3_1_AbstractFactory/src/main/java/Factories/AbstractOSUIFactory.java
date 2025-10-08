package Factories;

import Products.Button;
import Products.Checkbox;

public interface AbstractOSUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
