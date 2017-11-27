package blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> q) {
		this.queue = q;
	}

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println(queue.take());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
