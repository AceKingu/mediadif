package mediadif.ConsoleApplication;

import mediadif.mockups.DEDWritaConsulting;
import mediadif.mockups.WRITA;

/**
 *
 * @author antnhu
 */
public class Mediadif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WRITA fen = new WRITA();
        DEDWritaConsulting fen2 = new DEDWritaConsulting();
        fen2.setVisible(true);
        fen.setVisible(true);
    }

}
