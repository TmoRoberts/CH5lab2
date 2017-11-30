
/**
 * Write a description of class Compare1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare1
{
    // instance variables - replace the example below with your own
    private int x;

    public static String largest(String s1, String s2) {
        if (s1.compareTo(s2) < 0) {
            return s2;
        }
        else {
            return s1;
        }
    }
}
