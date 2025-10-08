package Products;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paintCheckbox() {
        System.out.println("Painting MacOS checkbox");
    }

    @Override
    public void onClickCheckbox() {
        System.out.println("Clicked MacOS checkbox");
    }
}
