public class Main {
    public static void main(String[] args) {

        /// BAD
        Rectangle rectangle = new Rectangle(10, 25);
        Square square = new Square(10);

        System.out.println(rectangle.area());
        System.out.println(square.area());


        /// GOOD
        Rectangle rectangle1 = RectangleFactory.rectangle(10, 25);
        Square square1 = RectangleFactory.square(10);

        System.out.println(rectangle1.area());
        System.out.println(square1.area());
    }
}
