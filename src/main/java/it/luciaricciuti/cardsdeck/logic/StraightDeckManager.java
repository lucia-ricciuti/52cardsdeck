package it.luciaricciuti.cardsdeck.logic;

import it.luciaricciuti.cardsdeck.beans.Card;
import it.luciaricciuti.cardsdeck.beans.Deck;
import it.luciaricciuti.cardsdeck.beans.Suit;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * A straight implementation of a manager of decks.
 * @author Lucia Riccuti
 */
public class StraightDeckManager implements DeckManager {

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.logic.DeckManager#shuffle(it.luciaricciuti.cardsdeck.beans.Deck)
	 */
	public void shuffle(Deck deck) {
		List<Card> cardsList = deck.getListOfCards();
		Collections.shuffle(cardsList, new Random(System.currentTimeMillis()));
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.logic.DeckManager#extractCards(it.luciaricciuti.cardsdeck.beans.Deck, it.luciaricciuti.cardsdeck.beans.Suit)
	 */
	public List<Card> extractCards(Deck deck, Suit suit) {
		return deck.getListOfCards()
			.stream()
			.filter(c -> c.getSuit().equals(suit))
			.collect(Collectors.toList())
		;
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.logic.DeckManager#order(it.luciaricciuti.cardsdeck.beans.Deck)
	 */
	public void order(Deck deck) {
		// TODO Auto-generated method stub
		
	}


}
