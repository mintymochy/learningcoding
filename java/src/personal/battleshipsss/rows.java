package personal.battleshipsss;

import java.util.*;

/*
 05-29-2024
 augustjones
 :3
 */
public class rows {
    static char[] row = new char[10];

    public rows() {
        this.row = row;
    }

    public char[] getRow() {
        return row;
    }

    public void setShot(int boardNum, char shot) {
        row[boardNum] = shot;
    }

    public int getLength() {
        return row.length;
    }

    public void fillRow() {
        for (char x : row) {
            row[x] = ' ';
        }
    }
}
