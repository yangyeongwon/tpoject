package kr.co.tproject.template.ambassador.face.impl;

import kr.co.tproject.template.ambassador.face.RemoteService;
import static kr.co.tproject.template.ambassador.face.enums.RemoteServiceStatus.FAILURE;

public class ServiceAmbassador implements RemoteService {

	private static final int RETRIES = 3;
	private static final int DELAY_MS = 3000;
	
	
	
	@Override
	public long doRemoteFunction(int value) {
		return safeCall(value);
	}

	public long safeCall(int value) {
		int retries = 0;
		long result = FAILURE.getRemoteServiceStatusValue();
		return result;
	}
}
