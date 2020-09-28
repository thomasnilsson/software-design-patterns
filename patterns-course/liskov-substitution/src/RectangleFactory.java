import org.w3c.dom.css.Rect;

public class RectangleFactory {

    public static Rectangle rectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    public static Square square(double size) {
        return new Square(size);
    }
}
