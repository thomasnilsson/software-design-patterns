import java.util.List;

public class Main {

    /// Open-close-principle
    /// Open for extension
    /// Closed for modification

    /// The interfaces/classes are correct and should not be modified down the line
    /// However they can be extended, and combined in order to achieve new functionality.

    public static void main(String[] args) {
        System.out.println("Hello world");

        Product apple = new Product("apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("tree", Color.GREEN, Size.LARGE);
        Product house = new Product("house", Color.RED, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter filter = new ProductFilter();
        System.out.println("Green items");
        filter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p));

        System.out.println("Large items");
        filter.filterBySize(products, Size.LARGE).forEach(p -> System.out.println(p));

        BetterProductFilter betterProductFilter = new BetterProductFilter();

        System.out.println("Large items");

        SizeSpecification sizeSpec = new SizeSpecification(Size.LARGE);
        betterProductFilter.filter(products, sizeSpec).forEach(p -> System.out.println(p));

        System.out.println("Green items");
        ColorSpecification colorSpec = new ColorSpecification(Color.GREEN);
        betterProductFilter.filter(products, colorSpec).forEach(p -> System.out.println(p));

        System.out.println("Green and Large items");
        CombiSpecification<Product> combiSpec = new CombiSpecification<>(List.of(colorSpec, sizeSpec));
        betterProductFilter.filter(products, combiSpec).forEach(p -> System.out.println(p));

    }
}
