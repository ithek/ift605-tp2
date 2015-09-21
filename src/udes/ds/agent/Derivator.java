package udes.ds.agent;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Derivator extends Remote {
	public AbstractEquation getDerivative(String equation) throws RemoteException;
}
