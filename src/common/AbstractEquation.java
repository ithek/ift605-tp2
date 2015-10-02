/**
 * udes.ds.agent.hw
 * AbstractEquation.java
 * 7 oct. 09
 */
package common;

import java.rmi.Remote;

import server.Derivable;

/**
 * TODO add type comments
 * 
 * @author      Luc Bergevin
 * @version     1.0
 * @see          
 */
public abstract class AbstractEquation implements Remote, Equation, Derivable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Returns a user-readable form of the equation
	 *
	 * @return      String          
	 */
	public abstract String getUserReadableString();

	/**   
	 * @see udes.ds.rmi.hw.Equation#printUserReadable()      
	 */
	public void printUserReadable() {
		System.out.println("y = " + this.getUserReadableString());
	}
}
