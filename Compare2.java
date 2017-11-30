
/**
 * Write a description of class Compare2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare2
{
    // instance variables - replace the example below with your own
    public static int compareTo(int a, int b) {
        if (a>b) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public static int largest(int a, int b) {
        if (compareTo(a,b) < 0) {
            return b;
        }
        else {
            return a;
        }
    }
}
