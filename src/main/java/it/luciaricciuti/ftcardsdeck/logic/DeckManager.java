/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.logic;

import java.util.List;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;
import it.luciaricciuti.ftcardsdeck.beans.Suit;

/**
 * Interface for the manager of decks.
 * It allows to perform operations on decks.
 * @author Lucia Riccuti
 */
public interface DeckManager {

	/**
	 * Shuffles the deck.
	 * @param deck
	 */
	void shuffle(Deck deck);
	
	/**
	 * Get all cards with the same suit from a deck.
	 * @param deck
	 * @param suit
	 * @return the list of cards
	 */
	List<Card> extractCards(Deck deck, Suit suit);
	
	/**
	 * Orders a deck.
	 * @param deck
	 */
	void order(Deck deck);
	
	
}
