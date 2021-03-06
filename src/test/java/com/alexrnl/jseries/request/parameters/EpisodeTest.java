package com.alexrnl.jseries.request.parameters;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for the {@link Episode} class.
 * @author Alex
 */
public class EpisodeTest {
	/** The episode to test */
	private Episode episode;
	
	/**
	 * Set up test attributes.
	 */
	@Before
	public void setUp () {
		episode = new Episode(8);
	}
	
	/**
	 * Test method for {@link Parameter#getName()}.
	 */
	@Test
	public void testGetName () {
		assertEquals("episode", episode.getName());
	}
	
	/**
	 * Test method for {@link Parameter#getValue()}.
	 */
	@Test
	public void testGetValue () {
		assertEquals(Integer.valueOf(8), episode.getValue());
	}
}
