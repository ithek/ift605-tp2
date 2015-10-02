package server;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import common.Derivator;

public class Server {

	public static void main(String[] args) {
		try {
			//System.setSecurityManager(new RMISecurityManager());
			
			Registry registry = LocateRegistry.createRegistry(1099);
			
            Derivator derivator = (Derivator) UnicastRemoteObject.exportObject(new DerivatorImpl(), 1099);
            ThreadManager tm = (ThreadManager) UnicastRemoteObject.exportObject(new ThreadManagerImpl(), 1099);
            
			registry.rebind("Derivator", derivator);
			registry.rebind("ThreadManager", tm);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
