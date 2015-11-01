/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.view;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;

/**
 * Class that does the rendering of a Deck.
 * @author Lucia Riccuti
 */
public class DeckDisplayer implements Displayer<Deck> {

	/**
	 * 
	 */
	public DeckDisplayer() {
	}

	/* (non-Javadoc)
	 * @see it.luciaricciuti.cardsdeck.view.Displayer#display(java.lang.Object)
	 */
	public String display(Deck deck) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Deck is:\n");
		int count = 0;
		for (Card card : deck.getCardsList()) {
			count++;
			buffer.append(String.format("%6s", new CardDisplayer().display(card)));
			if (count % Deck.AMOUNT_FOR_SUIT == 0) {
				buffer.append("\n");
			}
		}
		
		return buffer.toString();
	}

}
