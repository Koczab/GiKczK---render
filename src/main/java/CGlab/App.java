package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {

        String path = null;
        int h = 0;
        int w = 0;

        try{

            path = args[0];
            w = Integer.parseInt(args[1]);
            h = Integer.parseInt(args[2]);
        } catch(Exception e) {
            System.out.println("Podaj dobra ścieżkę, szerokość oraz wysokość zdjęcia");
            return;
        }

        Renderer mainRenderer = new Renderer(System.getProperty("user.home")+ "/" + path, h, w);
        mainRenderer.clear();
        mainRenderer.drawPoint(100, 100);
        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVersion() {
        return this.version;
    }
}