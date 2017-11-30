
/**
 * Write a description of class ProbablilityDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProbablilityDriver
{
    public static void main(String[] args) 
    {
      Probability p1 = new Probability(1, 2);
      Probability p2 = new Probability(3,4);
      System.out.println(p1.probabilityAND(p2));
      System.out.println(p1.probabilityOR(p2, 3/8));
    }
}
