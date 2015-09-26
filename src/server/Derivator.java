package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import common.AbstractEquation;

public interface Derivator extends Remote {
	public AbstractEquation getDerivative(String equation) throws RemoteException;
	public void loop() throws RemoteException;
}
