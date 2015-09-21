package udes.ds.agent;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class DerivatorServer {

	public static void main(String[] args) {
		try {
            Derivator d = (Derivator) UnicastRemoteObject.exportObject(new DerivatorImpl(), 10000);
            Registry registry = LocateRegistry.createRegistry(10000);
			registry.rebind("Derivator", d);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
