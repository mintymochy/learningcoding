package Unit_1_2_3;

/*
 * August Jones
 * 2023-12-05 09:04
 * AP CSA
 * :3
 */
public class ShortWords {

    public static void main(String[] args) {
        String str = "I Love AP Computer Science ";
        int maxLength = 4;
        printShortWords(str, maxLength);
    }

    public static void printShortWords(String str, int maxLength) {
        StringBuilder s = new StringBuilder(" ");
        int num = 0;
        int length = str.length();
        int x = 0;
        char c;
        for (int i = 0; i < str.length(); i++)
            do {
                c = str.charAt(x);
                s.setCharAt(x, c);

            } while (c != ' ');
        if (s.length() == maxLength) {
            System.out.print(s);
            s.delete(0, s.length());
        } else {
            s.delete(0, s.length());
        }
    }
}