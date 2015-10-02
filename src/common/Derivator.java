package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Derivator extends Remote {
	public Equation getDerivative(Equation eq) throws RemoteException;
	public void loop() throws RemoteException;
}
