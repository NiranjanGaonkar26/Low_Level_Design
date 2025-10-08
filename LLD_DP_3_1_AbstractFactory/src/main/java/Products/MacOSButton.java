package Products;

public class MacOSButton implements Button {
    @Override
    public void paintButton() {
        System.out.println("Painting MacOS button");
    }

    @Override
    public void onClickButton() {
        System.out.println("Clicked MacOS button");
    }
}
