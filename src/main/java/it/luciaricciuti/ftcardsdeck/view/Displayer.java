/**
 * 
 */
package it.luciaricciuti.ftcardsdeck.view;

/**
 * Interface for the classes that renders an object.
 * @author Lucia Riccuti
 */
public interface Displayer<T> {
	
	/**
	 * Renders the element.
	 * @param element
	 * @return a String that is the representation of the element
	 */
	String display(T element);

}
