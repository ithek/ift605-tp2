package server;

import java.rmi.RemoteException;

import common.AbstractEquation;
import common.BasicEquation;

public class DerivatorImpl implements Derivator {

	@Override
	public AbstractEquation getDerivative(String equation) throws RemoteException {
		String equationParts[] = equation.split("\\^");
		
		AbstractEquation eq = new BasicEquation(1, Integer.parseInt(equationParts[1]));
		
		return eq.getDerivative();
	}

	@Override
	public void loop() throws RemoteException {
		int i = 0;
		while(i == 0)
		{
			System.out.println("Loop");
		}
	}

}
