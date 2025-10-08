package Products;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paintCheckbox() {
        System.out.println("Painting Windows checkbox");
    }

    @Override
    public void onClickCheckbox() {
        System.out.println("Clicked Windows checkbox");
    }
}
