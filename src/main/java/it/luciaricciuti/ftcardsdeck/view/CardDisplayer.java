/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.view;

import it.luciaricciuti.ftcardsdeck.beans.Card;

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
		String numberDisplay = null;
		switch (card.getNumber()) {
		case 11:
			numberDisplay = "J";
			break;

		case 12:
			numberDisplay = "Q";
			break;

		case 13:
			numberDisplay = "K";
			break;

		default:
			numberDisplay = String.valueOf(card.getNumber());
			break;
		}

		String suiteDisplay = null;
		switch (card.getSuit()) {
		case CLUBS:
			suiteDisplay = "\u2667";
			break;

		case DIAMONDS:
			suiteDisplay = "\u2662";
			break;

		case HEARTS:
			suiteDisplay = "\u2661";
			break;

		case SPADES:
			suiteDisplay = "\u2664";
			break;

		default:
			suiteDisplay = card.getSuit().toString();
			break;
		}
		
		return numberDisplay + suiteDisplay;
	}

	
}
