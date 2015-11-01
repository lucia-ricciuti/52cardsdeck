package it.luciaricciuti.ftcardsdeck.logic;

import java.util.stream.Collectors;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;

/**
 * Manager of decks with custom implementation of ordering method.
 * @author Lucia Riccuti
 */
public class CustomDeckManager extends StraightDeckManager{

	/* (non-Javadoc)
	 * @see it.luciaricciuti.ftcardsdeck.logic.StraightDeckManager#order(it.luciaricciuti.ftcardsdeck.beans.Deck)
	 */
	@Override
	public void order(Deck deck) {
		
	}

	private Deck recursiveQuickSort(Deck deck) {
		if (deck.size() <= 1) {
			return deck;
		}
		
		int pivotPosition = deck.size() / 2;
		Card pivot = deck.get(pivotPosition);
		
		Deck leftSubDeck = 
			(Deck)deck
				.stream()
				.filter(card -> card.compareTo(pivot) < 0)
				.collect(Collectors.toList())
			;
		
		Deck rightSubDeck = 
				(Deck)deck
					.stream()
					.filter(card -> card.compareTo(pivot) > 0)
					.collect(Collectors.toList())
				;

		// TODO finish implementation
		
		return null;
	}
	
}
