package server;

import java.rmi.RemoteException;
import java.util.Set;

public class ThreadManagerImpl implements ThreadManager {

	@SuppressWarnings("deprecation")
	@Override
	public void stopThread(String name) throws RemoteException {
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		Thread[] threads = threadSet.toArray(new Thread[threadSet.size()]);

		for(int i = 0; i < threads.length; ++i) {
			if(name.equals(threads[i].getName())) {
				threads[i].stop();
			}
		}
	}

}
