public class OldschoolPrinter implements Printer {
    @Override
    public void print(Document d) {
        System.out.println(d.content);
    }
}
