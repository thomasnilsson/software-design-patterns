import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {



    public void saveToFile(Journal j, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(j.toString());
            }
        }
    }
}
