public class BadOldschoolPrinter implements Machine {

    @Override
    public void print(Document d) {
        // Can do
    }

    @Override
    public void fax(Document d) {
        // Cant do :(
    }

    @Override
    public void scan(Document d) {
        // Cant do :(
    }
}
