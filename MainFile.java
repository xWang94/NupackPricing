package nupackpricing;

import nupackpricing.NupackPricing;

public class MainFile {
    
    public static void main(String[] args) {
        NupackPricing Calculators = new NupackPricing();
        double answer = Calculators.computePrice(1000, 0, "furniture"); 
        // Print the cost in 2 decimal places.
        System.out.printf("The final price for the project $%.2f", answer);  
        }
}
