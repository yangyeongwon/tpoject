package kr.co.tproject.template.balking.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.balking.service.cla.WashingMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class App {

	@Test
	void test() {
		WashingMachine washingMachine = new WashingMachine();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++) {
			executorService.execute(washingMachine::wash);
		}
		
		try {
			if(!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
				executorService.shutdown();
			}
		} catch(InterruptedException ie) {
			log.error("ERROR: Waiting on executor service shutdown!");
			Thread.currentThread().interrupt();
		} 
	}
}

