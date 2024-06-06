package personal.battleshipsss;

import java.util.*;

/*
 05-29-2024
 augustjones
 :3
 */
public class rows {
    static char[] row = new char[10];

    public char[] getRow() {
        return row;
    }

    public void setRow(int boardNum, char shot) {
        row[boardNum] = shot;
    }

    public void fillRow() {
        for (char x : row) {
            row[x] = ' ';
        }
    }
}
