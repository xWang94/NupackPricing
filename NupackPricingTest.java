/*
 * JUnit testing for NupackPricing.java
 */

package nupackpricing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NupackPricingTest {
    
    NupackPricing nupack = new NupackPricing();
    
    /**
    * Test of computePrice method, of class NupackPricing.
    * Testing correctness for flat markup (no workers or materials involved).
    */
    @Test
    public void testComputeFlatMarkup() {
         // When comparing results, delta in assertEquals allows 0.005
         // difference because the result is rounded to 2 decimal places.
         double result = nupack.computePrice(1000, 0, "furniture");
         assertEquals(result, 1050.00, 0.005);
    }
    
    /**
    * Test of computePrice method, of class NupackPricing.
    * Testing correctness for worker's markup. 
    * If error occurs, always check to see if testComputeFlatMarkup passes
    * first. It it did pass, error occurs at worker's markup calculation. 
    */
    @Test
    public void testComputeWorker() {
         double result = nupack.computePrice(1000, 10, "furniture");
         assertEquals(result, 1176.00, 0.005);
    }
   
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 1 on PDF, food markup is required.
     * If error occurs, see testComputeWorker comment first. If both test cases
     * above passed, error occurs at food's markup calculation. 
     */
    @Test
    public void testComputeFood() {
        double result = nupack.computePrice(1299.99, 3, "food");
        assertEquals(result, 1591.58, 0.005);  
    }    
  
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 2 on PDF, pharmaceuticals markup is required.
     * If error occurs, see testComputeWorker comment first. If both test cases
     * above passed, error occurs at pharmaceutical markup calculation.
     */
    @Test
    public void testComputePharmaceuticals() {
        double result = nupack.computePrice(5432.00, 1, "drugs");
        assertEquals(result, 6199.81, 0.005);
    }
    
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 3 on PDF, other materials do not require markup.
     * If error occurs, see testComputeWorker comment first. If both test cases
     * above passed, error occurs at other materials markup calculation.
     */
    @Test
    public void testComputeOtherMaterials() {
        double result = nupack.computePrice(12456.95, 4, "books");
        assertEquals(result, 13707.63, 0.005);
   }
   
  /**
   * Test of computePrice method, of class NupackPricing.
   * Testing correctness for electronic material markup.
   * If error occurs, see testComputeWorker comment first. If both test cases
   * above passed, error occurs at electronics markup calculation.
   */
   @Test
    public void testComputeElectronics() {
        double result = nupack.computePrice(1000, 0, "electronics");
        assertEquals(result, 1071.00, 0.005);
   }   
}
