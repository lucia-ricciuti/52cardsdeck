/**
 * 
 */
package it.luciaricciuti.cardsdeck.view;

/**
 * Interface for the classes that renders an object.
 * @author Lucia Riccuti
 */
public interface Displayer<T> {
	
	String display(T element);

}
