package Factory;

public class ShapeFactory {
    Shape shape;

    public Shape getShape(String shapeName){
        switch (shapeName){
            case "Circle":
                shape = new Circle();
                break;
            case "Square":
                shape = new Square();
                break;
            case "Triangle":
                shape = new Triangle();
                break;
            default: shape = null;
        }
        return shape;
    }
}
