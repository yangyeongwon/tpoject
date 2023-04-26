package kr.co.tproject.template.business_delegate.main;

import org.junit.jupiter.api.Test;

import kr.co.tproject.template.business_delegate.service.cls.BusinessDelegate;
import kr.co.tproject.template.business_delegate.service.cls.BusinessLookup;
import kr.co.tproject.template.business_delegate.service.cls.MobileClient;
import kr.co.tproject.template.business_delegate.service.face.impl.NetflixService;
import kr.co.tproject.template.business_delegate.service.face.impl.YoutubeService;

class App {

	@Test
	void test() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		BusinessLookup businessLookup = new BusinessLookup();
		
		businessLookup.setNetflixService(new NetflixService());
		businessLookup.setYoutubeService(new YoutubeService());
		businessDelegate.setLookupService(businessLookup);
		
		MobileClient client = new MobileClient(businessDelegate);
		client.playbackMovies("DIE HARD 2");
		client.playbackMovies("Maradona: The Greatest Ever");
	}

}
