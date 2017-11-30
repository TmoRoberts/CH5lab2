
/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc
{
    // instance variables - replace the example below with your own
    double favorable;
    double sampleSpace;
    double prob;
    public Probability(double fav, double sample) {
        this.favorable = fav;
        this.sampleSpace = sample;
        this.prob = favorable/sampleSpace;
    }
  
    public double probabilityAND(Probability p2)
    {
        return this.prob * p2.prob;
    }
    
    public double probabilityOR(Probability p2, double overlap)
    {
        
        return this.prob + p2.prob - overlap;
    }
}
