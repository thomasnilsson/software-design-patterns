public interface Machine {

    /// ISP
    /// Dont put more into the interface than what is needed

    /// The following is bad; an old school printer will not be able to fax or scan documents
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}
