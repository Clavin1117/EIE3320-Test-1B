
/**
 * Write a description of class IPPrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPPrinter extends PPrinter implements Manufacturer
{
    private String ink;
    private String modelNo;
    
    public IPPrinter(String modelNo, String ink, double deliveryCost)
    {
        super(modelNo, deliveryCost);
        this.ink = ink;
    }
    
    public String toString()
    {
        return super.toString() + "ink model = " + ink + "\n";
    }
    
    public String getManufacturer()
    {
        return "Inkjet Photo Printer: Japan. Delivery Cost after additional fee: "+ (deliveryCost+addFee);
    }
}
