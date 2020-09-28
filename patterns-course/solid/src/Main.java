import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I had a bug");
        journal.addEntry("I solved the bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "journal.txt";
        persistence.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
