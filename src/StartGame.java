import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 * Created by Shaan on 4/5/2015.
 */
public class StartGame{


    public static void main(String[] args) {



        initgui();



    }

    private static void initgui() {
        ChessInterface gui = new ChessInterface();
        gui.setTitle("Shaans App");
        gui.setSize(400, 400);

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }


}
