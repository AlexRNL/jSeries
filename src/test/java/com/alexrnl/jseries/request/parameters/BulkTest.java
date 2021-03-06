package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Bulk} class.
 * @author Alex
 */
public class BulkTest {
	/** The bulk parameter which set the previous episodes as seen */
	private Bulk bulk;
	/** The bulk parameter which does not change the state of previous episodes */
	private Bulk notBulk;
		
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		bulk = new Bulk();
		notBulk = new Bulk(false);
	}
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("bulk", bulk.getName());
		assertEquals("bulk", notBulk.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertNull(bulk.getValue());
		assertFalse(notBulk.getValue());
	}
	
}
