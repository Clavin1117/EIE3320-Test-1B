//You are not allowed to modify the following class

public class Test1BQ1
{
    public static void main(String args[])
    {
        
        PPrinter[] obj = new PPrinter[5];
        obj[0] = new PPrinter("ABC124",50);
        System.out.println(obj[0]);        
        obj[1] = new LPPrinter("LP1220", "512MB", 70);
        System.out.println(obj[1]);
        obj[2] = new WLPPrinter("XYZ323", "512MB", "WiFi", 100);
        System.out.println(obj[2]);        
        obj[3] = new LPPrinterS("AAC234", "256MB", 14, 120);
        System.out.println(obj[3]);        
        obj[4] = new IPPrinter("IP1220", "PGX300", 50);
        System.out.println(obj[4]);
        
        for (int i = 0; i < 5; i++)
            if (obj[i] instanceof Manufacturer)
            {
                Manufacturer a = (Manufacturer) obj[i];
                System.out.println(a.getManufacturer());
            }
                
        System.out.println();
        
   	/*
        At the end of the test, you can download the test case from Blackboard. Please insert it here and use it for video demonstration.
        Your demonstration video should 
        (1) show your student ID & name which can be found at the first line of your program code, 
        (2) show how to compile and run and
        (3) show your output result. If your result is long, show your result page by page with at least 5 seconds pause in between.
        */      

            
    }
}
