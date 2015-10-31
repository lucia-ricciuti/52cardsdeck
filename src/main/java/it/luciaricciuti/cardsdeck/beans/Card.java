/**
 * 
 */
package it.luciaricciuti.cardsdeck.beans;

import java.io.Serializable;

/**
 * Class that represents a card in a 52 deck.
 * @author Lucia Riccuti
 */
public class Card implements Comparable<Card>, Serializable {

	private static final long serialVersionUID = 4230722323821152359L;

	private Suit suit;
	private int number; 
	
	/**
	 * @param suit
	 * @param number
	 */
	public Card(Suit suit, int number) {
		super();
		this.suit = suit;
		this.number = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Card other) {
		// Comparings suit first
		int result = suit.compareTo(other.getSuit());
		
		// If they are the same, then comparing number.
		if (result == 0){
			result = Integer.compare(number, other.getNumber());
		}
		
		return result;
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", number=" + number + "]";
	}

}
