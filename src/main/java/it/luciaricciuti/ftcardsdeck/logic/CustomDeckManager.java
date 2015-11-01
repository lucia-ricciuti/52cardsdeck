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
		// Ordering cards list ...
		List<Card> sortedCardsList = 
			recursiveQuickSort(deck.getCardsList());
		
		// ... and setting it to deck.
		deck.setCardsList(sortedCardsList);
	}

	/**
	 * Recursive method for implementing Quick Sort algorithm.
	 * @param cardsList
	 * @return
	 */
	private List<Card> recursiveQuickSort(List<Card> cardsList) {
		
		// End condition for recursion
		if (cardsList.size() <= 1) {
			return cardsList;
		}
		
		// Indentifying pivot element
		int pivotPosition = cardsList.size() / 2;
		Card pivot = cardsList.get(pivotPosition);
		
		// Obtaining left list that is
		// the list of elements that are less than pivot
		List<Card> leftSubCardsList = 
			cardsList
				.stream()
				.filter(card -> card.compareTo(pivot) < 0)
				.collect(Collectors.toList())
		;
		
		// Obtaining right list that is
		// list of elements that are greater than pivot
		List<Card> rightSubCardsList = 
			cardsList
				.stream()
				.filter(card -> card.compareTo(pivot) > 0)
				.collect(Collectors.toList())
		;

		// Applying same method to sub lists
		// and combining the ordered sub lists with pivot
		List<Card> sortedCardsList = new ArrayList<Card>();
		sortedCardsList.addAll(recursiveQuickSort(leftSubCardsList));
		sortedCardsList.add(pivot);
		sortedCardsList.addAll(recursiveQuickSort(rightSubCardsList));
		
		return sortedCardsList;
	}
	
}
