/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.beans;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class that represents the deck of 52 cards.
 * @author Lucia Riccuti
 */
public class Deck extends ArrayList<Card> {

	private static final long serialVersionUID = -3978405490286073001L;

	private static Logger logger = LoggerFactory.getLogger(Deck.class);

	/**
	 * It's the amount of cards for every suit.
	 */
	public final static int AMOUNT_FOR_SUIT = 13;
	
	/**
	 * 
	 */
	public Deck() {
		generate();
	}

	/**
	 * Fill the deck with the cards.
	 */
	private void generate() {
		try {
			for (Suit suit: Suit.values()) {
				for (int number=1; number <= AMOUNT_FOR_SUIT; number++) {
					Card card = new Card(suit, number);
					this.add(card);
				}
			}
		} catch (Exception e) {
			logger.error("An error occurred during generation of deck", e);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("Deck is:");
		this.stream().forEach(card -> buffer.append(card));
		
		return buffer.toString();
	}

}
