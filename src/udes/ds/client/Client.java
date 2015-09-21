package udes.ds.client;

import udes.ds.agent.Derivator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[] args)
	{
		try {
            Registry registry = LocateRegistry.getRegistry(10000);
            Derivator d = (Derivator) registry.lookup("Derivator");

            d.getDerivative("x^3").printUserReadable();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
