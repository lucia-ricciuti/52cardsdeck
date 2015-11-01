/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.view;

import it.luciaricciuti.ftcardsdeck.beans.Deck;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for {@link DeckDisplayer}
 * @author Lucia Riccuti
 */
public class DeckDisplayerTest {
	
	private static Logger logger = LoggerFactory.getLogger(DeckDisplayerTest.class);

	private DeckDisplayer displayer;
	
	@Before
	public void setUp() {
		displayer = new DeckDisplayer();
	}
	
	/**
	 * Tests {@link DeckDisplayer#display(Deck)}
	 */
	@Test
	public void testDisplay() {
		logger.info("Testing display");

		Deck deck = new Deck();
		
		String display = displayer.display(deck); 
		
		logger.info(display);
		
		Assert.assertNull(display);
	}

}
