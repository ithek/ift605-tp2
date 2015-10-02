package client;

import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import common.BasicEquation;
import common.Derivator;
import common.Equation;

public class Client {
	public static void main(String[] args)
	{
		try {
			//System.setSecurityManager(new RMISecurityManager());
			
            Registry registry = LocateRegistry.getRegistry();
            Derivator derivator = (Derivator) registry.lookup("Derivator");

            DivisionEquation eq = new DivisionEquation(new BasicEquation(2,3), new BasicEquation(4,3));
            
            derivator.getDerivative(eq).printUserReadable();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
