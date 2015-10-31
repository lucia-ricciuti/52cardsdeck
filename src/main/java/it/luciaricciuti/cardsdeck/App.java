package it.luciaricciuti.cardsdeck;

import it.luciaricciuti.cardsdeck.beans.Deck;
import it.luciaricciuti.cardsdeck.logic.DeckManager;
import it.luciaricciuti.cardsdeck.logic.StraightDeckManager;
import it.luciaricciuti.cardsdeck.view.DeckDisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LoggerFactory.getLogger(App.class);
    
	public static void main( String[] args ) {
    	
    	logger.info("App starting ....");

    	// Creating a deck
    	Deck deck = new Deck();
    	
    	// Showing deck before operations
    	logger.info("A new deck is ready. \n" + new DeckDisplayer().display(deck));
    	
    	// Instantiating a manager
    	DeckManager manager = new StraightDeckManager();
    	
    	// 1. Shuffling
    	manager.shuffle(deck);
    	
    	// Showing deck after shuffling
    	logger.info("We shuffled the deck. \n" + new DeckDisplayer().display(deck));
    	
    	logger.info("App finished ....");
    }
}
