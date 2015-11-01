package it.luciaricciuti.ftcardsdeck.logic;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;
import it.luciaricciuti.ftcardsdeck.beans.Suit;

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
		Collections.shuffle(deck.getCardsList(), new Random(System.currentTimeMillis()));
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.logic.DeckManager#extractCards(it.luciaricciuti.cardsdeck.beans.Deck, it.luciaricciuti.cardsdeck.beans.Suit)
	 */
	public List<Card> extractCards(Deck deck, Suit suit) {
		return deck.getCardsList()
			.stream()
			.filter(c -> c.getSuit().equals(suit))
			.collect(Collectors.toList())
		;
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.logic.DeckManager#ordedr(it.luciaricciuti.cardsdeck.beans.Deck)
	 */
	public void order(Deck deck) {
		deck.getCardsList().sort((c1, c2) -> c1.compareTo(c2));
	}


}
