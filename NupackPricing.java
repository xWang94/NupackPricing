/*------------------------------------------------------------------------------
 * Class NupackPricing
 * 
 * Author: Xiao Wang
 * 
 * Purpose: Compute the total price (totalPrice) of the service based on the 
 *          prodcut's base price (basePrice), number of workers 
 *          (numberOfWorkers), and the types of materials (material) involved.
 *          The markup also contributes to the totalPrice as it varies
 *          depending on the parameters required.
 * 
 * Pre-condition: The basePrice and numberOfWorkers must be real numbers
 *                greater than 0. 
 * 
 * Post-condition: All parameter variables are unchanged. The totalPrice has 
 *                 been identified. Return the totalPrice
 * 
 * Parameters:
 *              basePrice -- The base cost of the service.
 *              numberOfWorkers -- Amount of workers involved in the job.
 *              material -- The type of material involved in the job.
 * 
 * Returns: The total price (totalPrice) required from the service.
 *------------------------------------------------------------------------------
 */
 
package nupackpricing;

public class NupackPricing {

    /*
     * Given the parameters, compute the total price. 
     */
    public double computePrice(double basePrice, int numberOfWorkers, 
            String material) {
        
        // Markup rates for specific situations.
        double totalPrice;
        double flatMarkup = 0.05;
        double totalWorkerMarkup = (numberOfWorkers * 0.012);
        double pharmaceuticalMarkup = 0.075;
        double foodMarkup = 0.13;
        double electronicsMarkup = 0.02;
        
        // Calculation for types of materials that have different markup rate.
        if (material.equals("drugs")) {
            totalPrice = (basePrice * (1 + flatMarkup)) * (1 + totalWorkerMarkup 
                    + pharmaceuticalMarkup);
        }
        else if (material.equals("food")) {
            totalPrice = (basePrice * (1 + flatMarkup)) * (1 + totalWorkerMarkup
                    + foodMarkup);
        }
        else if (material.equals("electronics")) {
            totalPrice = (basePrice * (1 + flatMarkup)) * (1 + totalWorkerMarkup 
                    + electronicsMarkup);
        }
        else {
            totalPrice = (basePrice * (1 + flatMarkup)) * (1 + 
                    totalWorkerMarkup);
        }        
       return totalPrice;          
    }
}
