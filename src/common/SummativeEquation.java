/**
 * udes.ds.rmi
 * SummativeEquation.java
 * 3 sept. 08
 */
package common;

/**
 * Stores an equation of the type f(x) + g(x)
 * 
 * @author      Luc Bergevin
 * @version     1.0
 */
public class SummativeEquation extends AbstractEquation {
	
	private static final long	 serialVersionUID	= 1L;
	private Equation _first;
	private Equation _second;
	
	public SummativeEquation(Equation equation, Equation equation2) {
		super();
		_first = equation;
		_second = equation2;
	}

	public Equation getFirst() {
		return _first;
	}

	public Equation getSecond() {
		return _second;
	}

	/**  
	 * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)      
	 */
	public double getFunctionValue(double x) {
		return (_first.getFunctionValue(x) + _second.getFunctionValue(x));
	}

	/**   
	 * @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()      
	 */
	public String getUserReadableString() {
		return new String("(" + _first.getUserReadableString() + ")(" + _second.getUserReadableString() + ")");
	}

	@Override
	public Equation getDerivative() {
		return new SummativeEquation(_first.getDerivative(), _second.getDerivative());	
	}
}
