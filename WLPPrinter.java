
/**
 * Write a description of class WLPPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WLPPrinter extends LPPrinter
{
    private String com;

    public WLPPrinter(String modelNo, String memorySize, String com ,double deliveryCost)
    {
        super(modelNo,memorySize,deliveryCost);
        this.com = com;
    }
    
    public String toString()
    {
       return super.toString()+"wireless = " + com + "\n";
    }
}
