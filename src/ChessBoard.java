import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Shaan on 4/3/2015.
 */
public class ChessBoard {

    public static String[][] board = new String[8][8];


    public static void addPiece(int i, int y, String r) {

    }

    public static void showBoard(String[][] currentBoard) {
        for (int i = 0; i < 8; i++) {
            System.out.print("\n");
            for (int j = 0; j < 8; j++) {
                System.out.print(currentBoard[i][j] + " ");
            }
        }
    }


    public static String[][] initChessBoard(String[][] newBoard) {
        String bbishop = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_bishop.png";
        String bking = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_king.png";
        String bknight = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_knight.png";
        String bpawn = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_pawn.png";
        String bqueen = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_queen.png";
        String brook = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\black_rook.png";
        String wbishop = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_bishop.png";
        String wking = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_king.png";
        String wknight = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_knight.png";
        String wpawn = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_pawn.png";
        String wqueen = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_queen.png";
        String wrook = "C:\\Users\\Shaan\\Documents\\GitHub\\Chess\\Images\\white_rook.png";



        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0 || j == 7) {
                    newBoard[i][j] = brook;
                } else if (j == 1 || j == 6) {
                    newBoard[i][j] = bknight;
                } else if (j == 2 || j == 5) {
                    newBoard[i][j] = bbishop;
                } else if (j == 3) {
                    newBoard[i][j] = bking;
                } else if (j == 4) {
                    newBoard[i][j] = bqueen;
                }


            }
        }


        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {

                newBoard[i][j] = bpawn;
            }
        }

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {

                newBoard[i][j] = bpawn;
            }
        }
        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {

                newBoard[i][j] = wpawn;
            }
        }
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0 || j == 7) {
                    newBoard[i][j] = wrook;
                } else if (j == 1 || j == 6) {
                    newBoard[i][j] = wknight;
                } else if (j == 2 || j == 5) {
                    newBoard[i][j] = wbishop;
                } else if (j == 3) {
                    newBoard[i][j] = wking;
                } else if (j == 4) {
                    newBoard[i][j] = wqueen;
                }


            }
        }

        return newBoard;
    }


}


