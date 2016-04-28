/**
    InchToMeter.java
    
    Hassan shahzad aheer
    hassanshahzadaheer@gmail.com
    
    Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet
    of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals
    approximately 39.37 inches.)
*/
    public class InchToMeter {
    
        public static void main(String args[]) {
            
            double inch; // hold the number of inch.
            double meter; // hold the conversion of inch
        
            int feet = 12;
            inch = feet * 12;
            
            int count = 0;
            for (inch = 1; inch <= 100; inch++) {
                
            meter = inch / 39.37 ; // convert to meter
            System.out.print(+ inch + " inch is " + meter + " meter.\n");
                    
                if (count == 12) {
                    
                    System.out.println();
                    
                    count = 0;
                }
                        
            }
                
               
           
    }
}