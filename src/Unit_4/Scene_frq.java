package Unit_4;

import java.util.Random;
import java.util.Scanner;

/*
 * August Jones
 * 2023-11-28 07:37
 * AP-CSA
 * :3
 */
public class Scene_frq {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("how long do you want it to stretch?: ");
        int count = userIn.nextInt();
        System.out.print("Do you want trees ⍋ ↟ (y/n)?: ");
        String sTree = userIn.next().toLowerCase().stripTrailing().stripLeading();
        boolean treeBool = sTree.equals("y");
        int treeNum = 0;
        if (treeBool) {
            System.out.print("How many trees?: ");
            treeNum = userIn.nextInt();
        } // :3
        System.out.print("Do you want mountains ᨒ ⛰︎ (y/n)?: ");
        String sMount = userIn.next().toLowerCase().stripTrailing().stripLeading();
        boolean mountBool = sMount.equals("y");
        int mountNum = 0;
        if (mountBool) {
            System.out.print("How many Mountains?: ");
            mountNum = userIn.nextInt();
        }
        System.out.println();
        System.out.println();
        drawScene(treeBool, treeNum, mountBool, mountNum, count);

    }// :3

    public static void drawScene(boolean tB, int tN, boolean mB, int mN, int count) {
        Random r = new Random();
        String tree = "⍋";
        String tree2 = "↟";
        String mount = "ᨒ";
        String mount2 = "⛰︎";
        String moon = "☾";// all the chars used in the skyline
        String star = "＊";
        String star2 = "⋆";
        String star3 = "｡";
        String cloud = "☁︎";
        System.out.print(moon);
        for (int i = 0; i <= count; i++) {// prints out the skyline based on how long the user inputted
            int rand = r.nextInt(4) + 1;
            switch (rand) {
                case 1:
                    System.out.print(star);
                    break;
                case 2:
                    System.out.print(star2);
                    break;
                case 3:
                    System.out.print(star3);
                    break;
                case 4:
                    System.out.print(cloud);
            }
        } // :3
        System.out.println();
        if (mB && tB) {// checks if they want trees and mountains
            for (int i = 0; i < (tN + mN); i++) {
                int rand = r.nextInt(4) + 1;
                switch (rand) {
                    case 1:
                        System.out.print(mount);
                    case 2:
                        System.out.print(mount2);
                    case 3:
                        System.out.print(tree);
                    case 4:
                        System.out.print(tree2);
                }
            } // :3
        } else if (mB) {// executes if they only want mountains
            for (int i = 0; i < mN; i++) {
                int rand = r.nextInt(2) + 1;
                switch (rand) {
                    case 1:
                        System.out.print(mount);
                    case 2:
                        System.out.print(mount2);
                }
            }
        } else if (tB) {// executes if they only want trees
            for (int i = 0; i < tN; i++) {
                int rand = r.nextInt(2) + 1;
                switch (rand) {
                    case 1:
                        System.out.print(tree);
                    case 2:
                        System.out.print(tree2);
                }
            }
        }
    }
}// :3