import Factory.Shape;
import Factory.ShapeFactory;

public class Application {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape shape = sf.getShape("Circle");
        shape.draw();
    }
}
