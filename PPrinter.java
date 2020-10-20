
/**
 * Write a description of class PPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PPrinter
{
    private String modelNo;
    protected double deliveryCost;
    
    public PPrinter(String modelNo, double deliveryCost)
    {
        this.modelNo = modelNo;
        this.deliveryCost = deliveryCost;
    }

    public String toString()
    {
        return "modelNo = " + modelNo + "\n"+ "Delivery Cost = " + deliveryCost + "\n";
    }
}

