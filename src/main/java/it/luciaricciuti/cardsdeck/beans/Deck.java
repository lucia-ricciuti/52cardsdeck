/**
 * 
 */
package it.luciaricciuti.cardsdeck.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents the deck of 52 cards.
 * @author Lucia Riccuti
 */
public class Deck {

	/**
	 * It's the amount of cards for every suit.
	 */
	public final static int AMOUNT_FOR_SUIT = 13;
	
	/**
	 * The storage for the cards. 
	 */
	private List<Card> listOfCards;
	
	/**
	 * 
	 */
	public Deck() {
		generate();
	}

	/**
	 * Fills the storage.
	 */
	private void generate() {
		listOfCards = new ArrayList<Card>();
		for (Suit suit: Suit.values()) {
			for (int number=1; number <= AMOUNT_FOR_SUIT; number++) {
				Card card = new Card(suit, number);
				listOfCards.add(card);
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Deck is:");
		for (Card card : listOfCards) {
			buffer.append(card);
		}
		
		
		return buffer.toString();
	}

	/**
	 * @return the listOfCards
	 */
	public List<Card> getListOfCards() {
		return listOfCards;
	}

	/**
	 * @param listOfCards the listOfCards to set
	 */
	public void setListOfCards(List<Card> listOfCards) {
		this.listOfCards = listOfCards;
	}

}
