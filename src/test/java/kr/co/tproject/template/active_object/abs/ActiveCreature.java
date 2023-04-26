
package kr.co.tproject.template.active_object.abs;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ActiveCreature {
	private final Logger logger = LoggerFactory.getLogger(ActiveCreature.class.getName());

	private BlockingQueue<Runnable> requests;
	
	private String name;
	
	private Thread thread;
	
	private int status;
	
	protected ActiveCreature(String name) {
		this.name = name;
		this.status = 0;
		this.requests = new LinkedBlockingQueue<>();
		thread = new Thread(()-> {
			boolean infinite = true;
			while(infinite) {
				try {
					requests.take().run();
				} catch(InterruptedException e) {
					if(this.status != 0) {
						logger.error("Thread was interrupted. --> {}", e.getMessage());
					}
					infinite = false;
					Thread.currentThread().interrupt();
				}
			}
		});
		thread.start();
	}
	
	public void eat() throws InterruptedException {
		requests.put(() -> {
			logger.info("{} is eating!", name());
			logger.info("{} hasfinished eating!!", name());
		});
	}
	
	public void roam() throws InterruptedException {
		requests.put(() ->{ 
			logger.info("{} has started to roam in the wastelands", name());
		});
	}
	public void kill(int status) {
		this.status = status;
		this.thread.interrupt();
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public String name() {
		return this.name;
	}
	
	
}
