package kr.co.tproject.template.balking.service.face;

import java.util.concurrent.TimeUnit;

public interface DelayProvider {
	
	/*
	 *  일부 작업을 실행하는 동안 지연을 시뮬레이션하는 인터페이스.
	 */
	void executeAterDelay(long interval, TimeUnit timeUnit, Runnable task);
}
