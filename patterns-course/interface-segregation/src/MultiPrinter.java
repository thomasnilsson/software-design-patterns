public class MultiPrinter implements Printer, Scanner, Fax {
    @Override
    public void fax(Document d) {
        System.out.println("Faxed document");
    }

    @Override
    public void print(Document d) {
        System.out.println("Printed document");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanned document");
    }
}
