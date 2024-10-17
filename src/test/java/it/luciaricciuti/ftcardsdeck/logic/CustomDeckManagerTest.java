/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.luciaricciuti.ftcardsdeck.beans.Deck;

/**
 * Test class for {@link CustomDeckManager}
 * @author Lucia Riccuti
 */
public class CustomDeckManagerTest {
	
	private static Logger logger = LoggerFactory.getLogger(CustomDeckManagerTest.class);

	private CustomDeckManager manager;
	private Deck deck;

	@Before
	public void setUp() {
		manager = new CustomDeckManager();
		deck = new Deck();
	}
	
	/**
	 * Tests {@link CustomDeckManager#sort(Deck)}
	 */
	@Test
	public void testOrder() {
		logger.info("Testing order");

		manager.shuffle(deck);
		
		manager.sort(deck);
		
		logger.info(deck.toString());
		
		Assert.assertTrue(true);
	}
}
