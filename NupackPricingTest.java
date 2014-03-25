/*
 * JUnit testing for NupackPricing.java
 */
package nupackpricing;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

/**
 *
 * @author Xiao Wang
 */
public class NupackPricingTest {
    
    NupackPricing nupack = new NupackPricing();
    
    public NupackPricingTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
    * Test of computePrice method, of class NupackPricing.
    * Testing correctness for flat markup (no workers or materials involved).
    */
    @Test
    public void testComputeFlatMarkup() {
         System.out.println("Testing correctness for flat markup.");
         double result = nupack.computePrice(1000, 0, "furniture");
         assertEquals(result, 1050.00, 0.005);
    }
    
    /**
    * Test of computePrice method, of class NupackPricing.
    * Testing correctness for worker's markup.
    */
    @Test
    public void testCompute() {
         System.out.println("Testing correctness for flat markup.");
         double result = nupack.computePrice(1000, 10, "furniture");
         assertEquals(result, 1176.00, 0.005);
    }
   
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 1 on PDF, food markup is required.
     */
    @Test
    public void testComputeFood() {
        System.out.println("Testing correctness for food materials.");
        double result = nupack.computePrice(1299.99, 3, "food");
        
        // When comparing results, delta allows 0.005 difference because
        // it is round to 2 decimal places.
        assertEquals(result, 1591.58, 0.005);  
    }    
  
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 2 on PDF, pharmaceuticals markup is required.
     */
    @Test
    public void testComputePharmaceuticals() {
        System.out.println("Testing correctness for pharmaceutical materials.");
        double result = nupack.computePrice(5432.00, 1, "drugs");
        assertEquals(result, 6199.81, 0.005);
    }
    
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 3 on PDF, other materials do not require markup.
     */
    @Test
    public void testComputeOtherMaterials() {
        System.out.println("Testing correctness for other materials.");
        double result = nupack.computePrice(12456.95, 4, "books");
        assertEquals(result, 13707.63, 0.005);
   }
   
  /**
   * Test of computePrice method, of class NupackPricing.
   * Testing correctness for electronic material markup.
   */
   @Test
    public void testComputeElectronics() {
        System.out.println("Testing correctness for electronic material markup.");
        double result = nupack.computePrice(1000, 0, "electronics");
        assertEquals(result, 1071.00, 0.005);
   }   
    
 }
