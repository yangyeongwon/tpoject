package kr.co.tproject.template.ambassador.face.impl;


import kr.co.tproject.template.ambassador.face.RemoteService;
import kr.co.tproject.template.ambassador.face.enums.RemoteServiceStatus;
import kr.co.tproject.template.ambassador.face.util.RandomProvider;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class RemoteServiceImpl implements RemoteService {

	private static final int THRESHOLD = 200;
	private static RemoteServiceImpl serviceImpl = null;
	private final RandomProvider randomProvider;
	
	RemoteServiceImpl(RandomProvider randomProvider) {
		this.randomProvider = randomProvider;
	}
	
	private RemoteServiceImpl() {
		this(Math::random);
	};
 
	static synchronized RemoteServiceImpl getRemoteServiceImpl() {
		if(serviceImpl == null) serviceImpl = new RemoteServiceImpl();
		return serviceImpl;
	}
	
	@Override
	public long doRemoteFunction(int value) {
		
		long waitTime = (long)Math.floor(randomProvider.random() * 1000 );
		
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			log.error("Thread sleep state interrupted ========> {}", e);
			Thread.currentThread().interrupt();
		}
		return waitTime <= THRESHOLD ? value * 10
				: RemoteServiceStatus.FAILURE.getRemoteServiceStatusValue();
	}
}
