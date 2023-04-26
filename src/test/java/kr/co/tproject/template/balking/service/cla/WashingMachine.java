package kr.co.tproject.template.balking.service.cla;

import java.util.concurrent.TimeUnit;

import kr.co.tproject.template.balking.service.enums.WashingMachineState;
import kr.co.tproject.template.balking.service.face.DelayProvider;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WashingMachine {
	
	private final DelayProvider delayProvider;
	private WashingMachineState washingMachineState;
	
	 /**
	  * 제공된 delayProvider를 사용하여 WashingMachine의 새 인스턴스를 만듭니다. 이 생성자가 사용됩니다.
	  * 단위 테스트 목적으로만.
	  */
	public WashingMachine(DelayProvider delayProvider) {
		this.delayProvider = delayProvider;
		this.washingMachineState = washingMachineState.ENABLED;
	}
	
	public WashingMachine() {
		this((interval, timeUnit, task) -> {
			try {
				Thread.sleep(timeUnit.toMillis(interval));
			} catch (InterruptedException ie) {
				log.error("", ie);
				Thread.currentThread().interrupt();
			}
			task.run();
		});
	}

	public WashingMachineState getWashingmachineState(){
		return washingMachineState;
	}
	
	public synchronized void endOfWashing(){
		washingMachineState = WashingMachineState.ENABLED;
		log.info("{} : washing competed.", Thread.currentThread().getId());
	}
	
	/**
	 * 물체가 적절한 상태에 있는 경우 세탁을 담당하는 방법입니다.
	 */
	public void wash() {
		synchronized(this) {
			WashingMachineState machineState = getWashingmachineState();
		
			log.info("{}: Actual machine state : {}", Thread.currentThread().getName(), machineState);
			if(this.washingMachineState == WashingMachineState.WASHING) {
				log.error("Cannot wash if the machine has been already washing!");
				return;
			}
			this.washingMachineState = washingMachineState.WASHING;
		}
		log.info("{}: Doing the washing", Thread.currentThread().getName());
		this.delayProvider.executeAterDelay(50, TimeUnit.MILLISECONDS, this::endOfWashing);
	}
	
	
	
}
