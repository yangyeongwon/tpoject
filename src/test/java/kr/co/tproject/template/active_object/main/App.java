package kr.co.tproject.template.active_object.main;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.tproject.template.active_object.abs.ActiveCreature;
import kr.co.tproject.template.active_object.abs.ext.Orc;

class App implements Runnable{
	
	private static final Logger logger = LoggerFactory.getLogger(App.class.getName());
	
	private static final int NUM_CREATURES = 3;
	
	@Test
	void test() {
		App app = new App();
		app.run();
	}

	@Override
	public void run() {
		List<ActiveCreature> creatures = new ArrayList<>();
		
		try {
			for(int i=0; i<NUM_CREATURES; i++) {
				creatures.add(new Orc(Orc.class.getSimpleName() + i));
				creatures.get(i).eat();
				creatures.get(i).roam();
			}
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			logger.error(e.getMessage());
			Thread.currentThread().interrupt();
		} finally {
			for(int i=0; i<NUM_CREATURES; i++) {
				creatures.get(i).kill(0);
			}
		}
	}

}
