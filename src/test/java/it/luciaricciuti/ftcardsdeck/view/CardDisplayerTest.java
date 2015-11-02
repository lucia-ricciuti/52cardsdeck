/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.view;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Suit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class for {@link CardDisplayer}
 * @author Lucia Riccuti
 */
public class CardDisplayerTest {
	
	private static Logger logger = LoggerFactory.getLogger(CardDisplayerTest.class);

	private CardDisplayer displayer;
	
	@Before
	public void setUp() {
		displayer = new CardDisplayer();
	}
	
	/**
	 * Tests {@link CardDisplayer#display(Card)}
	 */
	@Test
	public void testDisplay() {
		logger.info("Testing display");
		
		Card card = new Card(Suit.HEARTS, 1);
		
		String display = displayer.display(card); 
		
		logger.info(display);
		
		Assert.assertNotNull(display);
	}

	/**
	 * Tests {@link CardDisplayer#display(Card)}
	 * with number greater than 10.
	 */
	@Test
	public void testDisplayWithNumberGreaterThan10() {
		logger.info("Testing display with number greater than 10");

		Card card = new Card(Suit.HEARTS, 11);
		
		String display = displayer.display(card); 
		
		logger.info(display);
		
		Assert.assertNotNull(display);
	}
}
