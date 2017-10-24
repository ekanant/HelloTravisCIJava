package com.myproject.HelloTravisCIJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        assertEquals(true, true);
    }
	
	@Test
	public void impossibleCase()
	{
		assertEquals(true, false);
	}
}
