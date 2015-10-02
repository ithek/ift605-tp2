/**
 * udes.ds.rmi
 * BasicEquation.java
 * 3 sept. 08
 */
package common;

/**
 * Stores an equation of the type kx^n
 * 
 * @author      Luc Bergevin
 * @version     1.0
 * @see          
 */
public class BasicEquation extends AbstractEquation {
	
	private static final long	 serialVersionUID	= 1L;
	private double _coefficient;
	private int _exponent;
	
	public BasicEquation(double coefficient, int exponent) {
		super();
		_coefficient = coefficient;
		_exponent = exponent;
	}

	public double getCoefficient() {
		return _coefficient;
	}

	public int getExponent() {
		return _exponent;
	}

	/**  
	 * @see udes.ds.rmi.hw.Equation#getFunctionValue(double)      
	 */
	public double getFunctionValue(double x) {
		return ((Math.pow(x,_exponent))*_coefficient);
	}

	/**  
	 * @see udes.ds.rmi.hw.AbstractEquation#getUserReadableString()      
	 */
	public String getUserReadableString() {
		return new String(Double.toString(_coefficient) + "x^" + Integer.toString(_exponent));
	}

	@Override
	public AbstractEquation getDerivative() {
		// l * x^1 becomes l through derivative
		if(_exponent == 1) {
			return new Constant(_coefficient);
		}
		// l * x^0 becomes 0 through derivative
		else if(_exponent == 0) {
			return new Constant(0);
		}
		// l * x^n becomes l*n*x^n-1 through derivative
		else {
			return new BasicEquation(_coefficient * _exponent, _exponent - 1);
		}	
	}
}
