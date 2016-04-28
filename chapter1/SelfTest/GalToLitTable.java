/**
    GalToLitTable.java
    
    Hassan shahzad aheer
    hassanshahzadaheer@gmail.com
    
    Try This 1-1
    This program converts gallons to liters.
*/
    public class GalToLitTable {
    
        public static void main(String args[]) {
            
            double gallons; // hold the number of gallons.
            double liters; // hold the conversion of gallons
            
            int counter = 0;
    
            for (gallons = 1; gallons <= 100; gallons++) {
                
                liters = gallons * 3.7854 ; // convert to liters
                System.out.print(+ gallons + " Gallons is " + liters + " liters.\n");
                
                counter ++;
                
                if (counter == 10) {
                    System.out.println();
                    
                    counter = 0;
                }
            }
           
    }
}