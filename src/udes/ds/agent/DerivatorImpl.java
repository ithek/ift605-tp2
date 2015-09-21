package udes.ds.agent;

import java.rmi.RemoteException;

public class DerivatorImpl implements Derivator {

	@Override
	public AbstractEquation getDerivative(String equation) throws RemoteException {
		String equationParts[] = equation.split("\\^");
		
		AbstractEquation eq = new BasicEquation(1, Integer.parseInt(equationParts[1]));
		
		return eq.getDerivative();
	}

}
