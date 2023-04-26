package kr.co.tproject.template.business_delegate.service.face.impl;

import kr.co.tproject.template.business_delegate.service.face.VideoStreamingService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class YoutubeService implements VideoStreamingService{

	@Override
	public void doProcessing() {
		log.info("YoutubeService is now processing");
	}

}
