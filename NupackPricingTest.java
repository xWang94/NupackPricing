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
     * Testing input example 1 on PDF
     */
    @Test
    public void testComputeExample1() {
        System.out.println("Compute Input 1 example.");
        double result = nupack.computePrice(1299.99, 3, "food");
        
        // When comparing results, delta allows 0.005 difference because
        // it is round to 2 decimal places.
        assertEquals(result, 1591.58, 0.005);  
   }    
   
    /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 2 on PDF
     */
    @Test
    public void testComputeExample2() {
        System.out.println("Compute Input 2 example.");
        double result = nupack.computePrice(5432.00, 1, "drugs");
        assertEquals(result, 6199.81, 0.005);
   }
    
        /**
     * Test of computePrice method, of class NupackPricing.
     * Testing input example 3 on PDF
     */
    @Test
    public void testComputeExample3() {
        System.out.println("Compute Input 3 example.");
        double result = nupack.computePrice(12456.95, 4, "books");
        assertEquals(result, 13707.63, 0.005);
   }
 }
