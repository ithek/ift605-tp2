package client;

import common.AbstractEquation;
import common.Equation;
import common.MultiplicativeEquation;

public class DivisionEquation implements Equation {
	
	private static final long	 serialVersionUID	= 1L;
	private Equation _first;
	private Equation _second;
	
	public DivisionEquation(AbstractEquation first, AbstractEquation second) {
		super();
		_first = first;
		_second = second;
	}

	@Override
	public double getFunctionValue(double x) {
		return (_first.getFunctionValue(x) * _second.getFunctionValue(x));
	}

	@Override
	public String getUserReadableString() {
		return new String("(" + _first.getUserReadableString() + ")(" + _second.getUserReadableString() + ")");
	}
	
	@Override
	public void printUserReadable() {
		System.out.println("y = " + this.getUserReadableString());
	}

	@Override
	public Equation getDerivative() {
		return new MultiplicativeEquation(_first.getDerivative(), _second.getDerivative());	
	}
}
