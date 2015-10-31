/**
 * 
 */
package it.luciaricciuti.cardsdeck.logic;

import java.util.List;

import it.luciaricciuti.cardsdeck.beans.Card;
import it.luciaricciuti.cardsdeck.beans.Deck;
import it.luciaricciuti.cardsdeck.beans.Suit;

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
	 * Orders a shuffled deck.
	 * @param deck
	 */
	void order(Deck deck);
	
	
}
