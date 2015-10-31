/**
 * 
 */
package it.luciaricciuti.cardsdeck;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.luciaricciuti.cardsdeck.beans.Card;
import it.luciaricciuti.cardsdeck.beans.Deck;
import it.luciaricciuti.cardsdeck.beans.Suit;
import it.luciaricciuti.cardsdeck.logic.StraightDeckManager;

/**
 * Test class for {@link StraightDeckManager}
 * @author Lucia Riccuti
 */
public class StraightDeckManagerTest {
	
	private static Logger logger = LoggerFactory.getLogger(StraightDeckManagerTest.class);

	private StraightDeckManager manager;
	private Deck deck;

	@Before
	public void initialize() {
		manager = new StraightDeckManager();
		deck = new Deck();
	}
	
	/**
	 * Tests {@link StraightDeckManager#shuffle(Deck)}
	 */
	@Test
	public void testShuffle() {
		manager.shuffle(deck);
		
		for (Card card : deck.getListOfCards()) {
			logger.debug(card.toString());
		}
		
		Assert.assertTrue(true);
	}
	
	/**
	 * Tests {@link StraightDeckManager#extractCards(Deck, it.luciaricciuti.cardsdeck.beans.Suit)}
	 */
	@Test
	public void testExtractCards() {
		Suit suit = Suit.HEARTS;
		
		List<Card> selectedCards = manager.extractCards(deck, suit);
		
		for (Card card : selectedCards) {
			logger.debug(card.toString());
		}

		Assert.assertEquals(Deck.AMOUNT_FOR_SUIT, selectedCards.size());
	}
}
