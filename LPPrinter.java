
/**
 * Write a description of class LPPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPPrinter extends PPrinter
{
    private String memorySize;
    
    public LPPrinter(String modelNo, String memorySize, double deliveryCost)
    {
        super(modelNo, deliveryCost);
        this.memorySize = memorySize;
    }
    
    public String toString()
    {
       return super.toString() + "Memory size = " + memorySize + "\n";
    }
}

