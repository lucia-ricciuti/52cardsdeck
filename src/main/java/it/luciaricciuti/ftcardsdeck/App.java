package it.luciaricciuti.ftcardsdeck;

import java.util.List;

import it.luciaricciuti.ftcardsdeck.beans.Card;
import it.luciaricciuti.ftcardsdeck.beans.Deck;
import it.luciaricciuti.ftcardsdeck.beans.Suit;
import it.luciaricciuti.ftcardsdeck.logic.CustomDeckManager;
import it.luciaricciuti.ftcardsdeck.logic.DeckManager;
import it.luciaricciuti.ftcardsdeck.logic.StraightDeckManager;
import it.luciaricciuti.ftcardsdeck.view.CardDisplayer;
import it.luciaricciuti.ftcardsdeck.view.DeckDisplayer;

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
    	
    	try {
        	// Creating displayers
        	DeckDisplayer deckDisplayer = new DeckDisplayer();
        	CardDisplayer cardDisplayer = new CardDisplayer();

        	// Creating a deck
        	Deck deck = new Deck();
        	
        	// Showing deck before operations
        	logger.info("A new deck is ready. \n" + deckDisplayer.display(deck));
        	
        	// Instantiating a manager
        	DeckManager manager = new StraightDeckManager();
        	
        	// 1. Shuffling
        	logger.info("Shuffling the deck ...");
        	manager.shuffle(deck);
        	
        	// Showing deck after shuffling
        	logger.info("Here is the shuffled deck. \n" + deckDisplayer.display(deck));

        	// 2. Get all cards with the same suit from a shuffled deck
        	Suit selectedSuit = Suit.HEARTS;
        	logger.info("Getting all cards with "+selectedSuit+" ...");
        	List<Card> cardsWithHearts = manager.extractCards(deck, selectedSuit);
        	
        	// Showing extracted cards
        	logger.info("Here are the extracted cards:\n");
        	cardsWithHearts.forEach(card -> logger.info(cardDisplayer.display(card)));
        	
        	// 3. Ordering the deck
        	logger.info("Ordering the deck ...");
        	manager.order(deck);
        	
        	// Showing the ordered deck
        	logger.info("Here is the ordered deck. \n" + deckDisplayer.display(deck));

        	// Instantiating a custom manager
        	CustomDeckManager customManager = new CustomDeckManager();
        	
        	// Shuffling again the deck
        	logger.info("Shuffling deck again ....");
        	customManager.shuffle(deck);
        	logger.info("Here is the newly shuffled deck. \n" + deckDisplayer.display(deck));

        	// Ordering deck with custom manager
        	logger.info("Ordering the deck with custom manager ...");
        	customManager.order(deck);
        	
        	// Showing the ordered deck
        	logger.info("Here is the ordered deck. \n" + deckDisplayer.display(deck));

        	logger.info("App finished ....");
		} 
    	catch (Exception e) {
    		logger.error("An unexpected error occurred", e);
		}
    	
    }
}
