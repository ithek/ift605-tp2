package server;

import java.rmi.RemoteException;

import common.Derivator;
import common.Equation;

public class DerivatorImpl implements Derivator {

	@Override
	public Equation getDerivative(Equation equation) throws RemoteException {
		return equation.getDerivative();
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
