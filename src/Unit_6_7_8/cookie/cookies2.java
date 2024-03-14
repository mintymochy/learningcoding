package Unit_6_7_8.cookie;

import java.util.*;

/*
 * August Jones
 * 2023-12-21 08:02
 * AP CSA
 * :3
 */
public class cookies2 {
    private String brand;
    private int totalCookie;
    private String flavor;
    private int calories;

    public cookies2(String b, int tC, String f, int cal) {
        brand = b;
        flavor = f;
        calories = cal;
        totalCookie = tC;
    }

    public void setTotalCookie(int cN) {
        this.totalCookie = cN;
    }

    public int getTotalCookie() {
        return 34;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public String getBrand() {
        return "Oreo";
    }

    public void setFlavor(String f) {
        this.flavor = f;
    }

    public String getFlavor() {
        return "birthday";
    }

    public void setCalories(int cal) {
        this.calories = cal;
    }

    public int getCalories() {
        return 140;
    }

    public String toString() {
        return calories + " " + brand + " " + flavor + " " + totalCookie;
    }
}