/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.beans;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class that represents the deck of 52 cards.
 * @author Lucia Riccuti
 */
public class Deck {

	private static Logger logger = LoggerFactory.getLogger(Deck.class);
	
	private List<Card> cardsList;

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
	
	public Deck(List<Card> cardsList) {
		super();
		this.cardsList = cardsList;
	}

	/**
	 * Fill the deck with the cards.
	 */
	private void generate() {
		try {
			cardsList = new ArrayList<Card>();
			for (Suit suit: Suit.values()) {
				for (int number=1; number <= AMOUNT_FOR_SUIT; number++) {
					Card card = new Card(suit, number);
					cardsList.add(card);
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
		// TODO Fix the + "\n"
		cardsList.stream().forEach(card -> buffer.append(card+"\n"));
		
		return buffer.toString();
	}

	public List<Card> getCardsList() {
		return cardsList;
	}

	public void setCardsList(List<Card> cardsList) {
		this.cardsList = cardsList;
	}

	
}
