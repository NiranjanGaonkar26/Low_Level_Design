package Products;

public class WindowsButton implements Button {
    @Override
    public void paintButton() {
        System.out.println("Painting Windows button");
    }

    @Override
    public void onClickButton() {
        System.out.println("Clicked Windows button");
    }
}
