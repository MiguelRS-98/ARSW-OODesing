package edu.escuelaing.arsw.oODesign;

import junit.framework.TestCase;

/**
 * This class test OoDesing.
 * @author Miguel Ángel Rodríguez Siachoque
 */
public class OoDesingTest extends TestCase 
{    
    /**
     * This method Test 1.
     */
    public void testDesing1OK () 
    {
        OoDesing test1 = new OoDesing();
            double [] res1 = test1.Constructor("OODesing1.txt");
            double a1 = 550.6;
            double a2 = 572.03;
            assertEquals(res1[0],a1);
            assertEquals(res1[1],a2);
    }
    
    /**
     * This method Test 1.
     */
    public void testDesing2OK () 
    {
    }
    
    /**
     * This method Test 1.
     */
    public void testDesing3OK () 
    {
    }
    
    /**
     * This method Test 1.
     */
    public void testDesing4OK () 
    {
    }
}
