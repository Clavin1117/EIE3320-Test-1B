
/**
 * Write a description of class LPPrinterS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPPrinterS extends LPPrinter implements Manufacturer
{
    private int time;

    public LPPrinterS(String modelNo, String memorySize, int time, double deliveryCost)
    {
        super(modelNo,memorySize,deliveryCost);
        this.time = time;
    }
    
    public String toString()
    {
       return super.toString() + "scanning time = " + time + "seconds" +"\n";
    }
    
    public String getManufacturer()
    {
        return "Laser Photo Printer with Scanner: US. Delivery Cost after additional fee: "+ (deliveryCost+addFee);
    }
}
