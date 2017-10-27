package mediadif.ConsoleApplication;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mediadif.dataManagement.CSVReader;

/**
 *
 * @author antnhu
 */
public class Mediadif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CSVReader lulz = new CSVReader();
        try {
            lulz.readFile();
        } catch (IOException ex) {
            Logger.getLogger(Mediadif.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
