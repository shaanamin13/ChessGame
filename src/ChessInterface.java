import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 * Created by Shaan on 4/5/2015.
 */
public class ChessInterface extends JFrame implements ActionListener{
    JPanel titleView;
    JButton startButton;
    JLabel myLabel;



   public ChessInterface(){
       titleView = new JPanel();

       startButton = new JButton("Start Game");
       startButton.addActionListener(this);
       myLabel = new JLabel();

       titleView.add(startButton);
       titleView.add(myLabel);

       this.add(titleView);

       String[][] gameboard = ChessBoard.board;
       gameboard = ChessBoard.initChessBoard(gameboard);

       gameView(gameboard);

   }

    private Component gameView(String[][] gameboard) {
        JPanel gameView = new JPanel();

        JButton[][] chessBoardSquares = new JButton[8][8];

        Insets buttonMargin = new Insets(0, 0, 0, 0);
        for (int i = 0; i < chessBoardSquares.length; i++) {
            for (int j = 0; j < chessBoardSquares[i].length; j++) {
                JButton b = new JButton();
                Icon icon2 = new ImageIcon(gameboard[i][j]);
                b.setMargin(buttonMargin);


                ImageIcon icon = new ImageIcon(
                        new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                b.setIcon(icon);
                if ((j % 2 == 1 && i % 2 == 1)
                        || (j % 2 == 0 && i % 2 == 0)) {
                    b.setBackground(Color.WHITE);
                } else {
                    b.setBackground(Color.BLACK);
                }
                b.setIcon(icon2);
                chessBoardSquares[j][i] = b;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                gameView.add(chessBoardSquares[j][i]);

            }
        }
        return this.add(gameView);

    }

    public void actionPerformed(ActionEvent event){
        myLabel.setText("button Clicked");
    }


}
