/**
    GravityOfMoon.java
    
    Hassan shahzad aheer
    hassanshahzadaheer@gmail.com
    
    The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your
    effective weight on the moon.
*/
    public class GravityOfMoon {
    
        public static void main(String args[]) {
          
          
          int moon = 20;
          int earth = 10;
          
          int weight = earth * moon;
          
          System.out.println("The effective weight on the moon is "+ weight);
    }
}