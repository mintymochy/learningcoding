import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Minesweeper {

    int tileSize = 70;
    int numRows = 8;
    int numCols = numRows;
    int boardWidth = numCols * tileSize;
    int boardHeight = numRows * tileSize;

    Jframe frame = new Jframes("Minesweeper");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();

    Minesweeper() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}