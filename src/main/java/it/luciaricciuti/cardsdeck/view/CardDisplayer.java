/**
 * 
 */
package it.luciaricciuti.cardsdeck.view;

import it.luciaricciuti.cardsdeck.beans.Card;

/**
 * Class that does the rendering of a Card.
 * @author Lucia Riccuti
 */
public class CardDisplayer implements Displayer<Card> {

	/**
	 * 
	 */
	public CardDisplayer() {
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.view.Displayer#display(java.lang.Object)
	 */
	public String display(Card card) {
		return card.getNumber() + "-" + card.getSuit().toString().substring(0, 1);
	}

	
}
