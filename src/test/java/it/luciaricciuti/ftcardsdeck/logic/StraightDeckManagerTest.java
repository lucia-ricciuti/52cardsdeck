/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.logic;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;
import it.luciaricciuti.ftcardsdeck.beans.Suit;
import it.luciaricciuti.ftcardsdeck.logic.StraightDeckManager;

/**
 * Test class for {@link StraightDeckManager}
 * @author Lucia Riccuti
 */
public class StraightDeckManagerTest {
	
	private static Logger logger = LoggerFactory.getLogger(StraightDeckManagerTest.class);

	private StraightDeckManager manager;
	private Deck deck;

	@Before
	public void setUp() {
		manager = new StraightDeckManager();
		deck = new Deck();
	}
	
	/**
	 * Tests {@link StraightDeckManager#shuffle(Deck)}
	 */
	@Test
	public void testShuffle() {
		logger.info("Testing shuffle");

		manager.shuffle(deck);

		logger.info(deck.toString());

		Assert.assertTrue(true);
	}
	
	/**
	 * Tests {@link StraightDeckManager#extractCards(Deck, Suit)}
	 */
	@Test
	public void testExtractCards() {
		Suit suit = Suit.HEARTS;
		
		logger.info("Testing ExtractCards with " + suit);

		List<Card> extractedCards = manager.extractCards(deck, suit);
		
		extractedCards.stream().forEach(card -> logger.info(card.toString()));

		Assert.assertEquals(Deck.AMOUNT_FOR_SUIT, extractedCards.size());
	}
	
	/**
	 * Tests {@link StraightDeckManager#order(Deck)}
	 */
	@Test
	public void testOrder() {
		logger.info("Testing order");

		manager.shuffle(deck);
		
		manager.order(deck);
		
		logger.info(deck.toString());
		
		Assert.assertTrue(true);
	}
}
