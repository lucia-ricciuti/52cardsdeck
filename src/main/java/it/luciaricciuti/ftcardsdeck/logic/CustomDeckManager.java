package it.luciaricciuti.ftcardsdeck.logic;

import java.util.ArrayList;
import java.util.List;
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
		List<Card> sortedCardsList = 
			recursiveQuickSort(deck.getCardsList());
		deck.setCardsList(sortedCardsList);
	}

	private List<Card> recursiveQuickSort(List<Card> cardsList) {
		if (cardsList.size() <= 1) {
			return cardsList;
		}
		
		int pivotPosition = cardsList.size() / 2;
		Card pivot = cardsList.get(pivotPosition);
		
		List<Card> leftSubCardsList = 
			cardsList
				.stream()
				.filter(card -> card.compareTo(pivot) < 0)
				.collect(Collectors.toList())
		;
		
		List<Card> rightSubCardsList = 
			cardsList
				.stream()
				.filter(card -> card.compareTo(pivot) > 0)
				.collect(Collectors.toList())
		;

		List<Card> sortedCardsList = new ArrayList<Card>();
		
		sortedCardsList.addAll(recursiveQuickSort(leftSubCardsList));

		sortedCardsList.add(pivot);
		
		sortedCardsList.addAll(recursiveQuickSort(rightSubCardsList));
		
		return sortedCardsList;
	}
	
}
