package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import server.Derivator;

public class Client {
	public static void main(String[] args)
	{
		try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Derivator derivator = (Derivator) registry.lookup("Derivator");

            derivator.getDerivative("x^3").printUserReadable();
            derivator.loop();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
