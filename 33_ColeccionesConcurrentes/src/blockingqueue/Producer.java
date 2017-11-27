package blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		Random r = new Random();

		try {
			while (true) {
				queue.put(r.nextInt(100));
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
