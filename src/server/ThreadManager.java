package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ThreadManager extends Remote {
	void stopThread(String name) throws RemoteException;
}
