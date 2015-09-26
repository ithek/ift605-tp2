package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import server.ThreadManager;

public class Admin {

	public static void main(String[] args) {
		try {
            Registry registry = LocateRegistry.getRegistry(1099);
            ThreadManager tm = (ThreadManager) registry.lookup("ThreadManager");

            tm.stopThread("RMI TCP Connection(1)-192.168.253.1");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
